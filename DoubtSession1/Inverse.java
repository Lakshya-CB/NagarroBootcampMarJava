package DoubtSession1;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 32145;
		
		int ans = 0;
		int place = 1;
		while(n!=0)
		{
			int rem = n%10;
			ans = ans + place*(int)Math.pow(10, rem-1);
			
			n = n/10;
			place++;
		}
		
		System.out.println(ans);

	}

}
