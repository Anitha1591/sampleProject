package org.hcl.test;

public class ClassA {
	
	public void Class1() {
		
		System.out.println("This is public class");
	}
	private void Class2(){
		
		System.out.println("This is private class");
	}
	protected void Class3() {
		
		System.out.println("This is protected class");
	}
	void Class4() {
		
		System.out.println("This is default class");
	}
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.Class1();
		a.Class2();
		a.Class3();
		a.Class4();
	}
	
}
