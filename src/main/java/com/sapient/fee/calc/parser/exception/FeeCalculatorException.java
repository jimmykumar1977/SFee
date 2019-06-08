package com.sapient.fee.calc.parser.exception;

public class FeeCalculatorException {
	public static class TxParserException extends RuntimeException { 
		private static final long serialVersionUID = -7484247244847947796L;
		public TxParserException(String errorMessage, Throwable err) {
	        super(errorMessage, err);
	    }	
	}
	
	public static class TxFileDownloaderException extends RuntimeException { 
		private static final long serialVersionUID = 5966999739907011804L;

		public TxFileDownloaderException(String errorMessage, Throwable err) {
	        super(errorMessage, err);
	    }	
	}

}
