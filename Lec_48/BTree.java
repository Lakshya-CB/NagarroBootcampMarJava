package Lec_48;

import java.util.Scanner;

public class BTree {
	private class Node {
		int data;
		Node left;
		Node right;
	}

	private Node root;

	public BTree() {
		// TODO Auto-generated constructor stub
		root = Cons(null, false);
	}

	Scanner scn = new Scanner(System.in);

	private Node Cons(Node parent, boolean is_left) {
		if (parent == null) {
			System.out.println("Root node ka data ?");
		} else if (is_left) {
			System.out.println(parent.data + " ke Left Childs ka data ?");
		} else {

			System.out.println(parent.data + " ke Right Childs ka data ?");
		}

		Node nn = new Node();
		nn.data = scn.nextInt();

		System.out.println(nn.data + " Has left child ?");
		boolean has_left = scn.nextBoolean();
		if (has_left) {
			nn.left = Cons(nn, true);
		}

		System.out.println(nn.data + " Has right child ?");
		boolean has_right = scn.nextBoolean();
		if (has_right) {
			nn.right = Cons(nn, false);
		}

		return nn;
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
		if(nn==null) {
			return 0;
		}
		
		
		int Left_ST = Size(nn.left);
		
		int Right_ST = Size(nn.right);
		
		return Left_ST+ Right_ST+1;
	}
	public int Max() {
		return Max(root);
	}
	private int Max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE; 
		}
		int Max_L = Max(nn.left);
		int Max_R = Max(nn.right);
		
		return Math.max(nn.data, Math.max(Max_L, Max_R));		
	}
}
