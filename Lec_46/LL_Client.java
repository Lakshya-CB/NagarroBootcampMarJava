package Lec_46;

public class LL_Client {
	public static void main(String[] args) {
		Linked_List LL = new Linked_List();
		LL.addLast(10);
		LL.addLast(20);
		LL.addLast(30);
		LL.addLast(40);
		LL.addLast(50);
		LL.addLast(60);

		LL.addLast(70);
		LL.addLast(80);
		LL.addLast(90);
		
		LL.addLast(100);
		LL.addLast(110);
		
		LL.Disp();
//		LL.k_rev( 3);
		LL.k_rev1(3);
		LL.Disp();
		
	}
}
