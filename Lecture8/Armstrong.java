package Lecture8;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printArmstrong(1, 1000);

	}
	
	public static void printArmstrong(int li, int up)
	{
		for(int i = li; i <= up; i++)
		{
			if(isArmstrong(i) == true)
			{
				System.out.println(i);
			}
		}
	}
	
	public static boolean isArmstrong(int n) {
		
		int nod = numberOfDigits(n);
		
		int ans = 0;
		int in = n;
		while(n != 0)
		{
			int rem = n%10;
			ans += (int)Math.pow(rem, nod);
			n /= 10;
		}
		
		if(ans == in)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public static int numberOfDigits(int n) {
		
		int count = 0;
		while(n != 0)
		{
			count++;
			n /= 10;
		}
		
		return count;
	}

}
