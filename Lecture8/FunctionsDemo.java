package Lecture8;

public class FunctionsDemo {

	
	static int val = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case 1
//		System.out.println("Hi main");
//		
		addition();
//		
//		
//		
//		//Case 2 
//		
////		additionParams(100, 200);
//		
//		//Case 3
//		
//		
////		int d = additionReturn();
//		
//		System.out.println(additionReturn());
//		System.out.println("Bye Main");
		
		
		
		
		
	}
	
	
	public static void swap(int a, int b)
	{
		int t = a;
		a = b;
		b = t;
		
	}
	
	public static int additionReturn()
	{
		int a = 100;
		int b = 200;
		int sum = a+b;
		return sum;

	}
	
	public static void addition()
	{
		int a = 10;
		int b = 20;
		
		int sum = a+b;
		
		subraction();
		System.out.println(sum);
	}
	
	public static void subraction()
	{
		int a = 100;
		int b = 200;
		
		int diff = b-a;
//		addition();
		System.out.println(diff);
	}

	public static void additionParams(int a, int b)
	{
		int sum = a+b;
		System.out.println(sum);
	}
	
	
}
