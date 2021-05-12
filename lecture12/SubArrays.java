package lecture12;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,2,3,-4};
		System.out.println();
		subArrayPrint(arr);
		System.out.println();
		subArrayPrintSum2Loops(arr);
		System.out.println();
		maxSubArraySum(arr);

	}
	
	public static void subArrayPrint(int[] arr)
	{
		for(int si = 0; si < arr.length; si++)
		{
			for(int ei = si; ei < arr.length; ei++)
			{
				for(int k = si; k <= ei; k++) {
					System.out.print(arr[k]+" ");
				}
				
				System.out.println();
			}
//			System.out.println();
		}
		
		
	}
	
	
	public static void subArrayPrintSum3Loops(int[] arr)
	{
		for(int si = 0; si < arr.length; si++)
		{
			for(int ei = si; ei < arr.length; ei++)
			{
				int sum = 0;
				for(int k = si; k <= ei; k++) {
					System.out.print(arr[k]+" ");
					sum = sum + arr[k];
				}
				
				System.out.println("-----> "+sum);
			}
//			System.out.println();
		}
		
		
	}

	public static void subArrayPrintSum2Loops(int[] arr)
	{
		for(int si = 0; si < arr.length; si++)
		{
			int sum = 0;
			for(int ei = si; ei < arr.length; ei++)
			{
					sum = sum + arr[ei];
					System.out.println(sum);
			}
		}
//			System.out.println();
	}
	
	public static void maxSubArraySum(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int si = 0; si < arr.length; si++)
		{
			int sum = 0;
			for(int ei = si; ei < arr.length; ei++)
			{
					sum = sum + arr[ei];
//					System.out.println(sum);
					if( max < sum)
					{
						max = sum;
					}
			}
		}
		System.out.println("Maximum sum:" + max);
		
	}
		
}
