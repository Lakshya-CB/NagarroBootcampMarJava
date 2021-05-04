package Lecture9;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = null;
		System.out.println(arr);
		
		arr = new int[5];
		System.out.println(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
//		int[] arr1 = arr;
//		arr1[0] = 100;
//		System.out.println(arr1);
//		
//		System.out.println(arr[0]);
		
		System.out.println(arr.length);
		
		System.out.println("---For Loop---");
		int sum = 0;
		for(int i = 0; i <= 4; i++)
		{
			sum = sum+arr[i];
			System.out.println(arr[i]);
		}
		
		System.out.println("---For Each Loop---");
		
		for(int val : arr) {
			System.out.println(val);
			val = 100;
		}
		
		System.out.println("---For Loop---");
		for(int i = 0; i <= arr.length-1; i++)
		{
			System.out.println(arr[i]);
		}
		
		int[] oth = new int[3];
		oth = arr;
		
		
		
		

	}

}
