package org.logo;

public class InstanceVariable {
	//instance variable
	int a=10;
	private void Logo() {
		System.out.println(a);

	}
private void Symbols() {
	System.out.println(a+20);

}
public static void main(String[] args) {
	InstanceVariable i=new InstanceVariable();
	i.Logo();
	i.Symbols();
}
}
