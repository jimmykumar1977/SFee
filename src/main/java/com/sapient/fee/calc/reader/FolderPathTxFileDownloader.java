package com.sapient.fee.calc.reader;

import java.io.File;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier(value = "folderPathTxFileDownloader")
@Service
public class FolderPathTxFileDownloader implements TxFileDownloader {

	@Override
	public File downloadFile() {
		return new File("Input data file.csv");
	}

}
