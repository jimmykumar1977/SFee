package com.sapient.fee.calc.parser;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.sapient.fee.calc.model.TxDetails;


public interface TxParser {

	static Date parseDate(String date) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			Date convertedCurrentDate = sdf.parse(date);
			System.out.println(convertedCurrentDate);
			return convertedCurrentDate;
		} catch (Exception ex) {
			return null;
		}
	}
	static Double parseMarketValue(String marketValue) {
		try{
			return Double.parseDouble(marketValue);
		}catch(Exception ex){
			return (double) 0;
		}
	}

	List<TxDetails> parserTransaction(final File txFile);
}
