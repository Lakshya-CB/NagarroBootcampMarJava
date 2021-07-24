package Lec_44;

public class Client_Min_Stack {
	public static void main(String[] args) throws Exception {
		Min_Stack MS = new Min_Stack();
		MS.push(7);
//		System.out.println(MS.Min());
		MS.push(60);

//		System.out.println(MS.Min());
		MS.push(5);

//		System.out.println(MS.Min());
		MS.push(50);

//		System.out.println(MS.Min());
		MS.push(2);

		System.out.println(MS.Min());
		
		
		MS.pop();
		System.out.println(MS.Min());

		MS.pop();
		System.out.println(MS.Min());
		
		MS.pop();
		System.out.println(MS.Min());
		
		
	}
}
