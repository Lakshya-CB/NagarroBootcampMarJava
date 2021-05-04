package Lecture8;

public class FD2 {

	static int val = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 200;
		
//		System.out.println(a+" "+b);
		System.out.println(val);
		
		int val = 20;
		swap(FD2.val,b);
		
		System.out.println(val);
		System.out.println(b);

//		int val = 20;
//		val = 200;
//		FD2.val = 1000;
//		System.out.println(val);
//		System.out.println(FD2.val);
//		System.out.println(a+" "+b);		

	}
	
	public static void swap(int val, int b)
	{
		int t = val;
		val = b;
		b = t;
//		val = 1000;
//		System.out.println(a+" "+b);		

	}

}
