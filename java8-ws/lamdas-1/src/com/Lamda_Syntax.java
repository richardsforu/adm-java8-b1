package com;

interface Test {
	void sayHello();
}

@FunctionalInterface
interface Test1 {
	void play();
}

@FunctionalInterface
interface Comparator {
	int compare(String s1, String s2);
}

public class Lamda_Syntax {

	public String display() {
		return "Message from display function";
	}

	public static void main(String[] args) {
		
		
		
		/*
		Comparator comparator=(String s1,String s2)->{
			int diff=s1.compareTo(s2);
			return diff;
		};
		*/
		
		
		//System.out.println(comparator.compare("S2", "S2"));
		
	
		/*
		Comparator comparator=(s1,s2)->{
			int diff=s1.compareTo(s2);
			return diff;
		};
		
		System.out.println(comparator.compare("S2", "S2"));
		
		*/
		
		/*
		Comparator comparator=(s1,s2)->{
			return s1.compareTo(s2);
		};
		
		*/
		
	
		Comparator comparator=(s1,s2)->s1.compareTo(s2);
		
		
		
		

		/*
		Lamda_Syntax l = new Lamda_Syntax();
		System.out.println(l.display());

		Test t = new Test() {
			@Override
			public void sayHello() {
				System.out.println("==> Saying Helloooo");
			}
		};

		Test1 t1 = () -> {
			System.out.println("==> Playing...");
		};

		t.sayHello();
		t1.play();
		*/

	}
}
