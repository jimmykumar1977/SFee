package com.sapient.fee.calc.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sapient.fee.calc.model.TxDetails;
import com.sapient.fee.calc.model.TxDetails.TxDetailsBuilder;
import com.sapient.fee.calc.parser.exception.FeeCalculatorException;
import com.sapient.fee.calc.utils.TxFileFormat;
import com.sapient.fee.calc.utils.TxType;

@Service
@Qualifier(value = "csvTxParser")
public class CSVTxParser implements TxParser {

	@Override
	public List<TxDetails> parserTransaction(final File txFile) {
		final List<TxDetails> txDetails = new ArrayList<TxDetails>();
		String line = null;
		try (BufferedReader reader = new BufferedReader(new FileReader(txFile))) {
			while ((line = reader.readLine()) != null) {
				final String[] txDetail = line.split(TxFileFormat.CSV.getFileDelimeter());
				final TxDetails tx = new TxDetailsBuilder().withExternalTransactionID(txDetail[0])
						.withClientId(txDetail[1]).withSecurityId(txDetail[2])
						.ofTransactionType(TxType.getTxType(txDetail[3]))
						.onTransactionDate(TxParser.parseDate(txDetail[4]))
						.atMarketValue(TxParser.parseMarketValue(txDetail[5]))
						.withPriority(txDetail[6] == "Y" ? Boolean.TRUE : Boolean.FALSE).build();

				txDetails.add(tx);
			}

		} catch (IOException e) {
			throw new FeeCalculatorException.TxParserException(e.getMessage(), e);
		}

		return txDetails;
	}

}
