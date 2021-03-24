package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Immutability_EX {
	
	public static void main(String[] args) {
		
		List<String> cities=new ArrayList<>(); // muttable list
		
		List<String> cities_v1= Arrays.asList("HYD","CHN","GOA"); // immutability
		
		cities.add("HYD");
		cities.add("CHN");
		cities.add("GOA");
		
		cities_v1.add("Mumbai");
		
		System.out.println(cities);
		System.out.println(cities_v1);
		
		
		
	}

}
