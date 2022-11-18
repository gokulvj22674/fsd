package org.logo;

public class StaticVariable {
	//static variable
	static int a=30;
	private static void Program() {
		System.out.println(a);

	}
private static void Numbers() {
	System.out.println(a-5);

}
public static void main(String[] args) {
	Program();
	Numbers();
	System.out.println(a+10);
	
}
}
