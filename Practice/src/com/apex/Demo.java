package com.apex;

public class Demo  extends Shape{
public static int a =10;//global static variable
public int b=11;//global instance variable
//static method
private static void m1() {
	int a=1;
	int b=2;
	int c=a+b;
	System.out.println(c);
	Demo ob = new Demo();
	System.out.println(ob.b);//global instance variable and static method
	System.out.println(Demo.a);//global static variable and static method
	
}
//Instance method
void m2() {
	int a=50;//local instance variable
	int b=35;//local instance variable
	System.out.println(a);// instance variable and method
	System.out.println(b);// instance variable and method
	System.out.println(this.b); // global instance variable and instance method
	System.out.println(Demo.a);//global static variable and instance method
	m1();// static method to instance method
	
}
public static void m3() {
	m1();// static method to static method
	Demo ant = new Demo();//     
	ant.m2();//instance method to static method
}
void m4() {
	m2();// instance method to instance method
}

// constructor
public Demo(){
System.out.println("constructor");	
}

//static block
static {
	System.out.println("static block");
}

//Instance block
{
	System.out.println("Instance block");
	}
//Method Overriding
 public void override() {
	System.out.println("Method Overriding");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		System.out.println(a);
		System.out.println(Demo.a);
		Demo obj = new Demo();
		System.out.println(obj.b);       
		obj.m2();
		m1();//static method and main method
// Abstraction 
		Shape s=new Rectangle();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
		
	
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
	
	
}
