package Lec_4;

public class Prime_2 {
public static void main(String[] args) {
	int n = 2;
	int div = 2; // I
	int count =0;
	while(div*div<=n) { // C 
//		Repeated work ???
		if (n%div==0) {
				System.out.println(div);
			count = count+1;
		}
		div=div+1; //U
	}
//	System.out.println(count);
	if(count ==0) {
		System.out.println(n+" is Prime ");
	}
	else {
		System.out.println(n+" is Not Prime" );
	}
	
}
}
