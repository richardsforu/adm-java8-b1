package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;

public class Example1 {
	
	public static void main(String[] args) {
		
		
		List<Dish> menu=Dish.menu;
		
		// till java 7 (imperative style)
		
		List<Dish> lowCaloriDishes=new ArrayList<>();
		
		for(Dish dish:menu) {
			if(dish.getCalories()<400)
			lowCaloriDishes.add(dish);
		}
		
		
		Collections.sort(lowCaloriDishes,new Comparator<Dish>() {
			@Override
			public int compare(Dish o1, Dish o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
		});
		
		//System.out.println(lowCaloriDishes);
		
		
		List<String> lowCalariDishNames=new ArrayList<>();
		
		for(Dish dish:lowCaloriDishes) {
			lowCalariDishNames.add(dish.getName());
		}
		
		for(String name:lowCalariDishNames) {
			//System.out.println(name);
		}
		
		/*
		 * --> imperative style (what + how mixed together)
		 * --> many mutable variables
		 * --> difficulty to apply concurrent/parallel operations
		 * 
		 */
		
		
		// in java 8: using stream api (declarative style)
		
		
		lowCalariDishNames=
				menu
				.stream()
				.parallel().
				filter(d->d.getCalories()<400)
				.sorted(comparing(Dish::getCalories))
				.map(Dish::getName)
				.collect(Collectors.toList());
		
		
		lowCalariDishNames.forEach(System.out::println);
		
		
		
		
		
		
	}

}
