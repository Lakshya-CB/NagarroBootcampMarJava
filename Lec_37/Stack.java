package Lec_37;

public class Stack {
	private int[] data;
	private int tos;

	public Stack() {
		// TODO Auto-generated constructor stub
		data = new int[5];
		tos = -1;
	}

	public Stack(int capacity) {
		// TODO Auto-generated constructor stub
		data = new int[capacity];
		tos = -1;
	}

	public void push(int ele) throws Exception {
		if(isFull()) {
//			System.out.println("No !");
			throw new Exception("Stack is Full!!");
			
		}
		tos++;
		data[tos] = ele;
	}

	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty!!");
		}
		int temp = data[tos];
		
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Stack is Empty!!");
		}
		return data[tos];
	}

	public int size() {
		return tos + 1;
	}
	public boolean isFull() {
		return size() == data.length;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public void disp() {
		int temp = tos;
		while(temp>=0) {
			System.out.print(data[temp]+ " ");
			temp--;
		}
		System.out.println(" + end");
	}
}
