package Lec_38;

public class Queue {
	private int[] data;
	private int front;
	private int size;

	public Queue() {
		// TODO Auto-generated constructor stub
		data = new int[5];
		front = 0;
		size = 0;
	}

	public Queue(int Capacity) {
		data = new int[Capacity];
		front = 0;
		size = 0;
	}

	public void EnQueue(int ele) throws Exception {
		if(isFull()) {
			throw new Exception("Queue !??! is LULL");
		}
		int rear = (front + size)%data.length;
		data[rear] = ele;
		size++;
		return;
	}
	
	public int DeQueue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Queue?!! is Kull");
		}
		int temp = data[front];
		front=(front+1)%data.length;
		size--;
		return temp;
	}
	public int size() {
		return size;
	}
	public boolean isFull() {
		return size()==data.length;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public void disp() {
		for(int i=0;i<size;i++) {
			int idx = (front + i)%data.length;
			System.out.print(data[idx] + " ");
		}
		System.out.println(" + End");
		System.out.println("---------------");
	}
}
