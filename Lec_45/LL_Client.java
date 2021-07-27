package Lec_45;

public class LL_Client {
	public static void main(String[] args) {
		Linked_List LL = new Linked_List();
		LL.addLast(10);
		LL.Disp();
		LL.addLast(20);
		LL.Disp();
		LL.addLast(30);
		LL.Disp();
		LL.addLast(40);
		LL.Disp();
		LL.addAt(2, 25);
		LL.Disp();
		
		System.out.println(LL.Size());
		
		System.out.println(LL.getAt(3));
		LL.Reverse();
		LL.Disp();
	}
}
