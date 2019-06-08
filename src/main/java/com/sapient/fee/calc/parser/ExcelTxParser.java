package com.sapient.fee.calc.parser;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sapient.fee.calc.model.TxDetails;

@Service
@Qualifier(value = "excelTxParser")
public class ExcelTxParser implements TxParser {

	@Override
	public List<TxDetails> parserTransaction(File txFile) {
		throw new UnsupportedOperationException("Excel Parser not supported yet");
	}

}
