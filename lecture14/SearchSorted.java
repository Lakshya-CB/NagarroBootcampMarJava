package lecture14;

public class SearchSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,4,5,9},{2,6,7,10},{8,11,17,20}};
		System.out.println(ss(arr,15));
		
		

	}
	
	public static boolean ss(int[][] arr,int ele)
	{
		int row = 0;
		int col = arr[0].length-1;
		
		while(col >= 0 && row < arr.length)
		{
			if(arr[row][col] == ele)
			{
				return true;
			}
			else if (arr[row][col] > ele)
			{
				col--;
			}
			else
			{
				row++;
			}	
		}
		return false;
	}

}
