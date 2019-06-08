package com.sapient.fee.calc.reader;

import java.io.File;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Qualifier(value = "ftpTxFileDownloader")
@Service
public class FtpTxFileDownloader implements TxFileDownloader {

	@Override
	public File downloadFile() {
		throw new UnsupportedOperationException("FTP Tx File Downloader not supported yet");
	}

}
