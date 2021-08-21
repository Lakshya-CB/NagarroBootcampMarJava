package Lec_53;

public class client {
	public static void main(String[] args) {
//		String[] arr = {"adfdsf"};
//		OOPs_demo.main(arr);
		Heap H = new Heap();
		H.add(20);
		H.add(10);
		H.add(5);
		H.add(500);
		H.add(2);
//		System.out.println(H.peek());
//		H.disp();
		System.out.println(H.poll());
		System.out.println(H.poll());
		System.out.println(H.poll());
		System.out.println(H.poll());
		System.out.println(H.poll());
		
	}
}
