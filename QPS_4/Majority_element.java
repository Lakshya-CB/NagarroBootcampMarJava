package QPS_4;

public class Majority_element {
	public static void main(String[] args) {
		int[] arr = {3,1,3,3,2} ;
		major_fn(arr);
	}
	public static int major_fn(int[] arr) {
		int major = arr[0];
		int freq = 1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==major) {
				freq++;
			}
			else {
				freq--;
			}
			
			if(freq==0) {
				major = arr[i];
				freq = 1;
			}
			System.out.println(major + " ; " + freq);
		}
		int real_freq=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==major) {
				real_freq++;
			}
		}
		if(real_freq >arr.length/2) {
			return major;
		}
		else {
			return -1;
		}
	}
}
