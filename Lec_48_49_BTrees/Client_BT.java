package Lec_48_49_BTrees;

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
		int[] in = {15,20,25,30,35,40};
		int[] pre = {30,20,15,25,40,35};
		BTree BB = new BTree(in, pre);
		BB.Disp();
//		BB.lvl_Trav2();
		System.out.println(BB.isBst());
		
	}
}
