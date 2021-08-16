package Lec_52;

import java.util.Scanner;

public class BST<YOY> {
	private class Node {
		YOY data;
		Node left;
		Node right;
	}

	private Node root;

	public BST() {
		// TODO Auto-generated constructor stub
//		root = Cons(null, false);

	}

	public BST(YOY[] in) {
		root = Create(in, 0, in.length-1);
		
	}

	private Node Create(YOY[] in, int lo, int hi) {
		if(lo>hi) 
			return null;
		int mid = (lo + hi) / 2;
		Node n = new Node();
		n.data = in[mid];
//		System.out.println(lo +" - "+ hi);
		n.left = Create(in, lo, mid - 1);
		n.right = Create(in, mid + 1, hi);

		return n;
	}

	public void Disp() {
		Disp(root);
	}

	private void Disp(Node nn) {
		if (nn == null) {
			return;
		}

//		Self Work
		String str = "";
		if (nn.left != null) {
			str = str + nn.left.data;
		}
		str = str + " -> " + nn.data + " <- ";

		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str);

//		Smaller Probl
		Disp(nn.left);
		Disp(nn.right);

	}

	public int Size() {
		return Size(this.root);
	}

	private int Size(Node nn) {
		if (nn == null) {
			return 0;
		}

		int Left_ST = Size(nn.left);

		int Right_ST = Size(nn.right);

		return Left_ST + Right_ST + 1;
	}

}
