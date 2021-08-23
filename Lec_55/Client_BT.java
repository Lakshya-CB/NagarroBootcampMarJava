package Lec_55;

public class Client_BT {
//10 true 20 true 40 false false true 50 false false true 30 false true 70 false false 

	public static void main(String[] args) {
//		BTree BB = new BTree(); 
//		System.out.println("-----------------");
//		BB.Disp();
//		System.out.println(BB.Size());
//		System.out.println(BB.Max());
//		System.out.println(BB.Find(100));
//		System.out.println(BB.Ht());
//		System.out.println(BB.Leaf());
//		System.out.println(BB.Diameter());
//		System.out.println(BB.Diameter1());
//		System.out.println(BB.Diameter2());
		int[] pre = {10,20,40,50,80,110,120,90,130,30,60,70,100};
		int[] in= {40,20,110,80,120,50,90,130,10,60,30,70,100};

		BTree BB = new BTree(in, pre);
//		BB.Disp();
//		BB.lvl_Trav2();
//		System.out.println(BB.isBst());
		BB.vertical_order();
	}
}
