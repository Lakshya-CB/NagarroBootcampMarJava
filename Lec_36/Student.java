package Lec_36;

public class Student {
// Data Members

	String name = "Unknpwn";
	int age = 0;

	public Student() {
		name = "chotu";
		age = 2;
	}

	public void intro() {
		System.out.println(this.name + " : " + this.age);
	}

	public void sayHello() {
		System.out.println("eloo bhaiya!! Hi my name is " + this.name);
	}

	public void sayHello2(String name) {
		System.out.println("aloo didi!!! Hi " + name + " didi my name is " + this.name);
	}

	public void Fun2Party(Student s, String name) {
		System.out.println("Student " + s.name + " is teasing who !? " + name);
	}

	public int size_of_name() {
		return this.name.length();
	}

}
