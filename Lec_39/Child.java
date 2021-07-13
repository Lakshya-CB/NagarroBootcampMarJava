package Lec_39;

public class Child extends Parent {
	int data = 20;
	int data2 = 22;

	@Override
	public void fun() {
//		fun();
		System.out.println("Child Fun");
//		super.fun();
	}

	@Override
	public String toString() {
		return "Child Data is = " + data;
	}
	public void fun2() {
		System.out.println("Child Fun2");
	}
}
