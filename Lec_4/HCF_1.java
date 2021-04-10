package Lec_4;

public class HCF_1 {
public static void main(String[] args) {
	int n1= 32;
	int n2 = 64;
	
	int min = Math.min(n1, n2);
	
	int divisor = 1;
	int hcf = 1;
	while(divisor<=min) {
//		Repeated work ?
		if(n1%divisor==0 && n2%divisor==0) {
//			System.out.println(div);
			hcf=divisor;
		}
		divisor=divisor+1;
	}
	System.out.println(hcf);
	
	
}
}
