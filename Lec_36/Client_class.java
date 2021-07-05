package Lec_36;

public class Client_class {
	public static void main(String[] args) {
//		String ss = new String();
		Student s = new Student();
//		System.out.println(s);
		System.out.println(s.name + "  " + s.age);
		s.age = 12;
		s.age = 13;
		s.age = 14;
		s.age = 15;
		s.name = "";
		s.name = "243523452";
		s.name = "1231";

		System.out.println(s.name + " : " + s.age);

		Student s1 = s;
//		System.out.println(s1);
//		System.out.println(s);

		s1.age = 99;

		System.out.println(s.age);

		s1.name = "Munna Bhai";
		System.out.println(s.name);

		System.out.println("---------------");

		s1 = new Student();
		System.out.println(s1.name + " : " + s1.age);
		System.out.println(s1);

		System.out.println(s);

		s1.name = "chirkuti";
		System.out.println(s.name);

		System.out.println("---------------");
		Student s3 = new Student();
		System.out.println(s3.name + " : " + s3.age);
		s3.name = "ranchi";
		System.out.println(s3.name + " : " + s3.age);

		System.out.println("---------------");
		Student s2 = new Student();
		s1.age = 1;
		s1.name = "A";
		s2.age = 2;
		s2.name = "B";

		System.out.println(s1.name + " : " + s1.age);
		System.out.println(s2.name + " : " + s2.age);
//		Test1(s1, s2);
//		Test3(s1, s2);
//		System.out.println(s1.name + " : " + s1.age);
//		System.out.println(s2.name + " : " + s2.age);

		System.out.println("---------------");
		Student s4 = new Student();
		s4.age = 4;
		s4.name = "D";
		int MyAge = 10;
		String myName = "Slim Shady!";
//		Test4(s1, s4.name, s4.age, MyAge, myName);
		System.out.println(s1.name + " : " + s1.age);
		System.out.println(s4.name + " : " + s4.age);
		System.out.println(MyAge);
		System.out.println(myName);
		System.out.println("---------------");
		System.out.println(s4);
		s4.sayHello();
		s4.sayHello2("Bichitra!!");
		System.out.println("---------------");
		s4.Fun2Party(s1, "namrata");
		System.out.println(s4.size_of_name());
		s4.name = "babu bhaiya";
		System.out.println(s4.size_of_name());
		
		System.out.println("---------------");
		Student s5 = new Student();
		s5.intro();
		
	}

	public static void Test4(Student s1, String name, int age, int myAge, String myName) {
		s1.name = "_";
		s1.age = 0;
		name = "_";
		age = 0;
		myName = "_";
		myAge = 0;

	}

	public static void Test1(Student a, Student b) {
		Student temp = a;
		a = b;
		b = a;
	}

	public static void Test2(Student a, Student b) {

		String temp_s = a.name;
		a.name = b.name;
		b.name = temp_s;

		int temp_a = a.age;
		a.age = b.age;
		b.age = temp_a;

	}

	public static void Test3(Student a, Student b) {

		String temp_s = a.name;
		a.name = b.name;
		b.name = temp_s;

		a = new Student();

		int temp_a = a.age;
		a.age = b.age;
		b.age = temp_a;

	}
}
