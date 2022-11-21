package com.oracle.java.gradlesplitbuild;

public class GradleSplitBuildApplication {

	public static void main(String[] args) {
		record Person(String firstName, String lastName) {}
		
		Person me = new Person("Billy","Korando");
		
		if(me instanceof Person(var first, var last)) {
			System.out.println(last + ", " + first);
		}
	}
}
