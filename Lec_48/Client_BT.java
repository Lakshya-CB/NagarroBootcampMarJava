package Lec_48;

public class Client_BT {
//10 true 20 true 40 false false true 50 false false true 30 false true 70 false false 

	public static void main(String[] args) {
		BTree BB = new BTree(); 
		System.out.println("-----------------");
		BB.Disp();
		System.out.println(BB.Size());
		System.out.println(BB.Max());
	}
}
