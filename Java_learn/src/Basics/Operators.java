package Basics;

import java.beans.beancontext.BeanContext;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		int c = a+b;		
		int d = a-b;
		int e = a*b;
		int f = a/b;
		
		Boolean z = (b<=a);
		
		System.out.println(z);
		
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);

		int x = 5 ;
		int y = x+5;
		
		
		int v = 12;
		v += 5; // 12+5 =17
		v -= 5; // 17-5 =12

		System.out.println(v);

		int w = 12;
		System.out.println(w++);
		
		
		System.out.println(y);
		
		int ab = 5;
		System.out.println(ab > 8 && ab < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
		System.out.println(ab > 8 || ab < 10); // returns true because 5 is greater than 3 AND 5 is less than 10
		System.out.println(!(ab > 2 && ab < 10)); // returns true because 5 is greater than 3 AND 5 is less than 10

		
	}

}
