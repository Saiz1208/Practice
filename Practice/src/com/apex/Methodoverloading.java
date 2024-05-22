package com.apex;

public class Methodoverloading extends Demo {
	String Contanct;
	int serial;
	public static void m1() {
		System.out.println("Plain M1");
	}
public static void m1(int a) {
	System.out.println(a);
}
public static void m1(String b) {
	System.out.println(b);
	
}
public static void m1(int a,int b) {
	int c;
	c=a+b;
	System.out.println(c);
}
//constructor overloading 
public Methodoverloading(String phonenumber) {
	this.Contanct = phonenumber;
}
public Methodoverloading(int id) {
	this("8220713550");
	this.serial= id;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
m1(10);
m1("Hello");
m1(5,10);

Methodoverloading mor = new Methodoverloading(100);
mor.override();//method over riding
System.out.println("Serial Numer:"+mor.serial+"\nContanct Number:"+mor.Contanct);//Constructor overloading
	}

}

