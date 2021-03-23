package com;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Util {
	public boolean isEmpty(String s) {
		return s.isEmpty();
	}
}

public class MethodReference_Ex {

	public static void main(String[] args) {
		
		Util util=new Util();
		boolean b = util.isEmpty("cts");
		
		//System.out.println(b);
		
		//-----------------------------------------
		
		List<String> strings=new ArrayList<>();
		strings.add("item-1");
		strings.add("");
		strings.add("item-2");
		
		
		
		//for(String data:strings) {
		//	System.out.println(util.isEmpty(data));
		//}
	
		Predicate<String> predicate=util::isEmpty;
		
		
		//strings.removeIf(s->util.isEmpty(s));
		strings.removeIf(predicate); // method reference
		
		//strings.forEach(str->System.out.println(str));
		
		strings.forEach(System.out::println);
		
		
		
		
		
		

	}

}
