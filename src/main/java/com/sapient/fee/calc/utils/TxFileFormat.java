package com.sapient.fee.calc.utils;

public enum TxFileFormat {
	
	CSV("CSV", ","), EXCEL("EXCEL"), XML("XML"), STRING("STRING", "|") ;
	
	private String fileFormat;
	private String fileDelimeter;
	
	private TxFileFormat(String fileFormat, String fileDelimeter) {
		this.fileFormat = fileFormat;
		this.fileDelimeter = fileDelimeter;
	}
	
	private TxFileFormat(String fileFormat) {
		this.fileFormat = fileFormat;
	}

	public String getFileFormat() {
		return fileFormat;
	}

	public String getFileDelimeter() {
		return fileDelimeter;
	}
}
