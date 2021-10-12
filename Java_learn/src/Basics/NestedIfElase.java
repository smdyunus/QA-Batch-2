package Basics;

public class NestedIfElase {

	public static void main(String[] args) {
		
		int age = 21;
		if (age>18) 
		{
			System.out.println("You are elegible for vote");
			
			if (age>60) 
			{
				System.out.println("You are a senior citizen");	
			}
			else 
			{
				System.out.println("You are not a senior citizen");

			}
		} 
		else 
		{
			System.out.println("You are not elegible for vote");

		}

	}

}
