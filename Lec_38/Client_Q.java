package Lec_38;

public class Client_Q {
	public static void main(String[] args) throws Exception {
		Queue Q = new Queue();
		Q.EnQueue(10);
		Q.EnQueue(20);
		Q.EnQueue(30);
		Q.EnQueue(40);
		Q.EnQueue(50);
		Q.disp();
		Q.DeQueue();
		Q.disp();
		Q.DeQueue();
		Q.disp();
		Q.DeQueue();
		Q.disp();
		Q.DeQueue();
		Q.disp();
		Q.EnQueue(60);
		Q.disp();
		Q.EnQueue(70);
		Q.disp();

		Q.EnQueue(80);
		Q.disp();

		Q.EnQueue(90);
		Q.disp();
//		Q.EnQueue(90);
//		Q.disp();
//		Q.EnQueue(90);
//		Q.disp();
//		Q.EnQueue(90);
//		Q.disp();
//		Q.EnQueue(90);
//		Q.disp();
	}
}
