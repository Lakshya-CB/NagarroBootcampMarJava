package Lecture9;

import java.util.Scanner;

public class ArrayOps {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = takeInput();
		
		System.out.println("--------------------");
		display(ar);
	}
	
	public static int[] takeInput()
	{
		System.out.print("Size: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print("a[ "+i+" ]: ");
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	static public void display(int[] arr)
	{
		for(int val : arr) {
			System.out.println(val);
		}
		
	}

}
