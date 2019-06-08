package com.sapient.fee.calc.utils;

public enum TxType {
	BUY, SELL, DEPOSITE, WITHDRAW;
	
	public static TxType getTxType(String txType) {
		return TxType.valueOf(txType);
	}
}
