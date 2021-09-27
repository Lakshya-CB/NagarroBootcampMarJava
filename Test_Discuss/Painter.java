package Test_Discuss;

import java.util.ArrayList;
import java.util.Scanner;

public class Painter {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> AL  = new ArrayList<Integer>();
		while(scn.hasNext()) {
			AL.add(scn.nextInt());
		}
		System.out.println(AL);
	}
}
