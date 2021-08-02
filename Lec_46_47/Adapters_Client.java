package Lec_46_47;

public class Adapters_Client {
	public static void main(String[] args) {
		Stack_Q_Push S = new Stack_Q_Push();
		S.push(10);
		S.push(20);
		S.push(30);
		S.push(40);

		System.out.println(S.Q);
		System.out.println(S.pop());

		System.out.println(S.Q);
		System.out.println(S.pop());

		System.out.println(S.Q);
		System.out.println(S.pop());

		System.out.println(S.Q);
		System.out.println(S.pop());

	}
}
