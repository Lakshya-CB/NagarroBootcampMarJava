package Lec_37;

public class Client_Stack {
	public static void main(String[] args) throws Exception {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.disp();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.disp();
		s.push(10);
		s.push(20);
		s.push(30);
		s.disp();
		
//		s.data = {1,1,1-1};
		System.out.println(s.size());
		s.disp();
		
	}
}
