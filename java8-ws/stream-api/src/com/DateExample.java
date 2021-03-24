package com;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateExample {
	
	public static void main(String[] args) throws ParseException {
		
		System.out.println(LocalDate.of(2021, 02, 23));
		
		System.out.println(LocalDate.now());
		
		System.out.println(LocalDateTime.now());
		
		String s1="03-12-23";
		DateFormat df=DateFormat.getDateInstance();
		df.parse(s1);
		//LocalDate d=  s1;
		//System.out.println(df);
		
		

	}

}
