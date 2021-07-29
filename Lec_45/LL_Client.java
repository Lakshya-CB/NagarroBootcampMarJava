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
//		LL.Reverse();
		LL.Rev_rec1();
		LL.Rev_rec1();
		
		LL.addLast(50);
		LL.Disp();
//		System.out.println(LL.Mid_point());
//		System.out.println(LL.Kth_last(1));
//		System.out.println(LL.Kth_last(2));
//		System.out.println(LL.Kth_last(3));
//		System.out.println(LL.Kth_last(4));
//		System.out.println(LL.Kth_last(5));
//		System.out.println(LL.Kth_last(6));
		LL.make_2_LL_test_Inter();
		
	}
}
