package com.apex;

public class Loop extends Methodoverloading {

	public Loop(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
	public static void ifelse() {
		int a=1;
		if (a<=2) {
		
			System.out.println("True");
			}
		else {
			System.out.println("False");}
			}
	public static void whileloop() {
		int a=5;
		while(a<=20) {
			
		System.out.println(a);
		a= a+5;
			}
			
		}
	public static void dowhile() {
		int i=3;
		do
		{
			System.out.println(i);
			i=i+1;
		}while(i<=3);	
	}
	
	public static void forloop() {
		for(int i=5;i<=7;i++) 
		System.out.println(i);
	}

	public static void switchcase() {
		int a=2;
		int b=2;
		int c;
		int option=2;
		
		switch (option) {
		case 1:
			System.out.println("Addition");
			c=a+b;
			System.out.println(c);
			break;
		case 2:
			System.out.println("Subtraction");
			c=a-b;
			System.out.println(c);
			break;
		case 3:
			System.out.println("Multiplication");
			c=a*b;
			System.out.println(c);
			break;
		case 4:
			System.out.println("Division");
			c=a/b;
			System.out.println(c);
			break;
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ifelse();
		whileloop();
		dowhile();
		forloop();
		switchcase();
		Loop lp = new Loop(1);
		lp.override();
		m1();
		
		
		
	}

}
