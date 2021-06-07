package Lec_24;

public class Rec_24 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 20,10,101,1,1,1,10,10, };
		System.out.println(last_Occ(arr, 0, 99));
		int[] ans = All_Occ(arr, 99, 0, 0);
		for(int val : ans) {
			System.out.print(val + " : ");
		}
		
	}

	public static int last_Occ(int[] arr, int index, int item) {
		if (index == arr.length) {
			return -1;
		}
		int sp = last_Occ(arr, index + 1, item);// SP;
		if (sp == -1 && arr[index] == item) {
			return index;
		}
		return sp;
	}

	public static int[] All_Occ(int[] arr, int ele, int index, int count) {
		if(arr.length==index) {
			int[] sp = new int[count];
			return sp;
		}
		
		if (arr[index] == ele) {
			int[] sp = All_Occ(arr, ele,index + 1, count + 1);// SP
			sp[count]= index;
			return sp;
		} else {
			int[] sp = All_Occ(arr, ele, index + 1, count);// SP
			return sp;
		}

	}


}
