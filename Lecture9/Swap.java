package Lecture9;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] = {1,2,3,4,5};
		int arr2 [] = {5,4,3,2,1};
		
//		int a = 5, b =7;
//		
//		for(int val : arr) {
//			System.out.println(val);
//		}
		
		
//		System.out.println(arr[0]+" "+arr[1]);
////		swap(arr[0],arr[1]);
//		swap2(arr,0,1);
//		System.out.println(arr[0]+" "+arr[1]);
		
		System.out.println(arr[0] +" "+ arr2[0]);
		swap4(arr,arr2);
		System.out.println(arr[0] +" "+ arr2[0]);
		
		for(int val : arr) {
			System.out.println(val);
		}
		System.out.println("------------");
		
		for(int val : arr2) {
			System.out.println(val);
		}

		
	}
	
	public static void swap(int a, int b) {
		int t = a;
		a = b;
		b = t;
	}
	
	public static void swap2(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	
	public static void swap3(int arr[], int arr2[]) {
		int[] t = arr;
		arr = arr2;
		arr2 = t;
		System.out.println(arr[0] +" "+ arr2[0]);
	}
	
	public static void swap4(int arr[], int arr2[]) {
		int t = arr[0];
		arr[0] = arr2[0];
		arr2[0] = t;
	}

}
