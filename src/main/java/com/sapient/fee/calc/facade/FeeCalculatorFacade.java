package com.sapient.fee.calc.facade;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sapient.fee.calc.model.TxDetails;
import com.sapient.fee.calc.parser.TxParser;
import com.sapient.fee.calc.reader.TxFileDownloader;

@Service
public class FeeCalculatorFacade {

	@Autowired
	@Qualifier("folderPathTxFileDownloader")
	private TxFileDownloader txFileDownloader; 
	
	@Autowired
	@Qualifier("csvTxParser")
	private TxParser txParser; 
	
	
	public  void processTransaction() {
		System.out.println("tx " + txFileDownloader);
		final File txFile = txFileDownloader.downloadFile();
		List<TxDetails> tx = txParser.parserTransaction(txFile);
		
		System.out.println("Tx : " + tx.get(0));
		
	}
}
