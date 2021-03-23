package com;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

public class FI_EX {
	
	public static void main(String[] args) {
		

		Function<String, Integer> function1=s->s.length()+100;
		System.out.println(function1.apply("Test"));
		
		Supplier<String> supplier=()->"Praveen";
		
		//System.out.println(supplier.get());
		
		BinaryOperator<Integer> binaryOperator=(n1,n2)->n1+n2;
		
		int r=binaryOperator.apply(10, 23);
		
		System.out.println(r);
		
		
		
		
		
		
		
		
	}

}
