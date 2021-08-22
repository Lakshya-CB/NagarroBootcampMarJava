package QPS_5;

public class Client {
	public static void main(String[] args) {
		int[] lvl = { 10,20,30,40,50,-1,70,-1,-1,-1,-1,-1,-1};
		Create_Tree_order T = new Create_Tree_order();
//		T.create_tree_lvl(lvl);
		
		int[] in = {10,20,40,-1,-1,50,-1,-1,30,-1,70,-1,-1};
		T.create_tree_pre(in);
		T.Disp();
	}
}
