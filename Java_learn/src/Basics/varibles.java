package Basics;

public class varibles {
	
	static int b =50; //  Global level , class level, static variable
	int d = 100; // Non static Variable
	
	int add() 
	{	
		int a = 10; // local variable
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		String s = "Yunus";
		
		System.out.println(a);
		System.out.println(s);	
		System.out.println(b);
		
		varibles v = new varibles();
		System.out.println(v.d);
	}

}
