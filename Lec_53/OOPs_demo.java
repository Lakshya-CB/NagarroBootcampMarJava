package Lec_53;

public class OOPs_demo {
	public static void main(String[] scam) {
		add(1,2,3);
		for(String chota : scam) {
			
			System.out.println(chota);
		}
		
	}
	
	public static void add(int a, int b) {
		System.out.println("fixed");
	}
	
	public static void add(int a) {
		System.out.println("fixed");
	}
	
//	Java !!
	
	public static void add(int lol,int...arr) {
		System.out.println("Var");
		
		for(int ll:arr) {
			System.out.println(ll);
		}
	}
	
//	public static void add(String a) {
//		return ;
//		
//	}
	
	
}
