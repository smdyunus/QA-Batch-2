package Basics;

public class ElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 16;
		if (age>18)   // 16 > 18 false
		{
			System.out.println("You are elegible for vote");
		}
		else if (age<18) {   //16 < 18 True
			System.out.println("You are not elegible for vote");

		}
		else { // 18 = 18 
			System.out.println("You are not allowed");

		}
	}

}
