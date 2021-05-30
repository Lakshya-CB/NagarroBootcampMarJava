package Lec_20;

public class String_Qs {
	public static void main(String[] args) {
//		print_ss("hello");
//		System.out.println(check_Palin("alola"));
//		print_ss_Palin("nitin");
		count_ss_Palin("nittan");
	}
	
	public static void print_ss(String str) {
		int count = 0;
		for(int si = 0 ; si <str.length();si++) {
			for(int se= si+1;se<=str.length();se++) {
				String ss = str.substring(si, se);
				count++;
//				System.out.println(ss);
			}
		}
		System.out.println(count);
	}
	public static void print_ss_Palin(String str) {
		int count = 0;
		for(int si = 0 ; si <str.length();si++) {  
			for(int se= si+1;se<=str.length();se++) {
				// n2
				String ss = str.substring(si, se); // O(n)
				
				if(check_Palin(ss)) { // O(n)
					count++;
//					System.out.println(ss);
				}
			}
		}
		System.out.println(count);
		
	}
	public static boolean check_Palin(String str) {
		int low = 0;
		int high = str.length()-1;

		while(low<high) {
			//
			// O(n2)
			if(str.charAt(high)==str.charAt(low)) {
				low++;
				high--;
				
			}
			else {
				return false;
			}
		}
		return true;
	}

	public static void count_ss_Palin(String str) {
		int count =0;
		for(int mid =0; mid <str.length();mid++) {
			for (int rad = 0; rad+mid <str.length() && mid-rad >=0;rad++) {
				if(str.charAt(mid+rad) == str.charAt(mid-rad)) {
					// Palindrome
					count++;
//					System.out.println(str.substring(mid-rad,mid+rad+1));
				}
				else{
					break;
				}
			}
		}
		for(double mid =0.5; mid <str.length();mid++) {
			for (double rad = 0.5; rad+mid <str.length() && mid-rad >=0;rad++) {
				if(str.charAt((int)(mid+rad)) == str.charAt((int)(mid-rad))) {
					// Palindrome
					count++;
//					System.out.println(str.substring((int)(mid-rad),(int)(mid+rad+1)));
				}
				else{
					break;
				}
			}
		}
	}
}
