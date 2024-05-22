package com.apex;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//One Dimensional Array
		int a[] = {10,20,30,40,50};// Elements with Initial Valve
		System.out.println(a[0]);
		int b[] = new int [5]; // Elements were default zero
		b[0]=11;
		b[1]=12;
		b[2]=13;
		b[3]=14;
		b[4]=15;

		System.out.println(b[0]);
		System.out.println(b);
		System.out.println(a.length);
		for (int i=0; i<a.length;i++ ) {
			System.out.println(a[i]);
		}
		
		// Enhanced for loop
		for (int bb:b) {
			System.out.println(bb);
		}
		
		Object obj [] = {80,'a',"array",null,true};
		for (int i=0; i<obj.length;i++ ) {
			System.out.println(obj[i]);
			
		}
	//Two Dimensional Array
					  //0   1  2  3  4 column
		int c [] [] = {{20,21,22,23,24},//0 row
						{30,31,32,33,34}//1 row
						};
		System.out.println(c[0][0]);
		System.out.println(c[1][1]);
		System.out.println(c[0][1]);
		System.out.println(c[1][4]);
		
	}

}
