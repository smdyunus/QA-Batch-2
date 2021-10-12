package Basics;

public class Methods 

{
	//Method Declaration
	//login() --> method name
	
	// Non Static
	void login() 
	{	
		System.out.println("Login Successfull");
	}
	
	int add() 
	{	
		int a = 10;
		return a;
	}
	
	// Static
	static void registration() 
	{
		System.out.println("Registration Successfull");

	}
	
	static String userName()
	{
		String name = "Yunus";
		return name; // Yunus
		
	}
	
	public static void main(String[] args) {	
		userName();
		System.out.println(userName());
		
		registration();   /// Reg suscess
		
		//Create a object
		Methods ref = new Methods();
		
		System.out.println(ref.add());
		ref.login(); // login success
	}
	
}
