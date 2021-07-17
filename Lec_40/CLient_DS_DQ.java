package Lec_40;

import Lec_37.Stack;

public class CLient_DS_DQ {
	public static void main(String[] args) throws Exception {
		Dynamic_Stack DS = new Dynamic_Stack();
		DS.push(10);
		DS.push(20);
		DS.push(30);
		DS.push(40);
		DS.push(50);

//		Rev_print(DS);
//		DS.disp();
//		Dynamic_queue QQ = new Dynamic_queue();
//		QQ.EnQueue(10);
//		QQ.EnQueue(20);
//		QQ.EnQueue(30);
//		QQ.EnQueue(40);
//		QQ.EnQueue(50);
//		QQ.disp();
//		QQ.DeQueue();
//		QQ.DeQueue();
//		QQ.EnQueue(60);
//		QQ.EnQueue(70);
//		QQ.EnQueue(80);
//		QQ.disp();

		DS.disp();
		Actual_rev(DS);
		DS.disp();
		Actual_rev(DS);
		DS.disp();

	}

	public static void Rev_print(Stack DS) throws Exception {
		if (DS.isEmpty()) {
			return;
		}
		int temp = DS.pop();
		Rev_print(DS);
		System.out.println(temp);
//		DS.pushstemp);
	}

	public static void Actual_rev(Stack DS) throws Exception {
//		Rev to Extra Stack-Process 1 
		Stack Extra = new Dynamic_Stack();
		while (!DS.isEmpty()) {
			Extra.push(DS.pop());
		}
//		Process 2; Pasta to Extra!!
		Rec_pasta(DS, Extra);
	}

	public static void Rec_pasta(Stack OS, Stack EX) throws Exception {
		if (EX.isEmpty()) {
			return;
		}
		int temp = EX.pop();
		Rec_pasta(OS, EX);
		OS.push(temp);
	}
}
