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
		int[] in = {40,20,50,10,30,70};
		int[] pre = {10,20,40,50,30,70};
		BTree BB = new BTree(in, pre);
		BB.Disp();
		BB.lvl_Trav2();
		
		
	}
}
