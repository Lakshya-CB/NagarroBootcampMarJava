package Lec_37;

public class Stack {
	int[] data;
	int tos;

	public Stack() {
		// TODO Auto-generated constructor stub
		data = new int[5];
		tos = -1;
	}

	public Stack(int cap) {
		// TODO Auto-generated constructor stub
		data = new int[cap];
		tos = -1;
	}

	public void push(int ele) {
		tos++;
		data[tos] = ele;
	}

	public int pop() {
		int temp = data[tos];
		data[tos] = 0;
		tos--;
		return temp;
	}

	public int peek() {
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
