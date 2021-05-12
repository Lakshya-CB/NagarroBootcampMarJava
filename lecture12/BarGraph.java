package lecture12;

public class BarGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,7,1,5,4};
		barGraph(arr);

	}
	
	public static void barGraph(int[] arr)
	{
		int max = maximum(arr);
		int row = 1;
		
		while(row <= max)
		{
			//Self work
			for(int i = 0; i < arr.length; i++)
			{
				if( max-arr[i] < row)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			//Updation
			row++;
			System.out.println();
		}
	}
	
	public static int maximum(int[] arr)
	{
//		int max = Integer.MIN_VALUE;
		int max = arr[0];
		for(int i = 1; i< arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		return max;
	}

}
