package Lec_37;

public class Client_Stack {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.disp();
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.push(10);
		s.push(20);
		s.push(30);
		s.disp();
		
	}
}
