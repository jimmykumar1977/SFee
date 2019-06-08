package com.sapient.fee.calc.reader;

import java.io.File;

import org.springframework.stereotype.Service;


public interface TxFileDownloader {
	public File downloadFile();
}
