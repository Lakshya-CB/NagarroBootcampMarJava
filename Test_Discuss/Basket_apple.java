package Test_Discuss;

public class Basket_apple {
	public static void main(String[] args) {
		int[] arr= {2849,1620,705,1,30};
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			avg= avg + arr[i];
		}
		avg = avg /arr.length;
		
		int apple_move =0;
		for(int i=0;i<arr.length;i++) {
			apple_move = apple_move + Math.abs(arr[i]-avg); //how many apples to move to make the basket avg ?!
		}
		
		System.out.println(apple_move/2);
	
	}
}
