package Lec_39;

import java.util.ArrayList;

public class Client {
	public static void main(String[] args) {
//		 Case 1
		Parent obj1 = new Parent();
		System.out.println(obj1.data);
		System.out.println(obj1.data1);
		
		obj1.fun();
		obj1.fun1();
		System.out.println("******************");
		
		
//		Case2 
		Parent obj2 = new Child();
		
		System.out.println(obj2.data1);
		System.out.println(((Child)obj2).data2);
		System.out.println(obj2.data);
		System.out.println(((Child)obj2).data);
		
		obj2.fun1();
//		obj2.fun2();
		((Child)obj2).fun2();
		System.out.println("------");
		obj2.fun();
		((Parent)obj2).fun();
		
//		Case 3
		
//		Child obj3 = new Parent(); //Not allowed 
//		System.out.println(obj3.data2);
		
//		Case 4
		Child obj4 = new Child();
		System.out.println(obj4.data);
		System.out.println(((Parent)obj4).data);
		((Parent)obj4).fun();
		obj4.fun();
//		
		System.out.println(obj4);
//		Object x = new Child();
		ArrayList<Integer> Al = new ArrayList<Integer>();
		System.out.println(Al);
	}
}
