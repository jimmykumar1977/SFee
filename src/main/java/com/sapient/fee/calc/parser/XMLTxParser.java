package com.sapient.fee.calc.parser;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sapient.fee.calc.model.TxDetails;

@Service
@Qualifier(value = "xmlTxParser")
public class XMLTxParser implements TxParser {

	@Override
	public List<TxDetails> parserTransaction(final File txFile) {
		throw new UnsupportedOperationException("XML Parser not supported yet");
	}

}
