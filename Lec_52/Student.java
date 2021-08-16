package Lec_52;

public class Student {
	static int Total_num_students;
	
	
	
	int Age;
	String Name;
	public Student(int a, String n) {
		// TODO Auto-generated constructor stub
		Age= a;
		Name = n;
		Total_num_students++;
		disp();
	}
	
//	Can you call non static data members in a static function ? NO!!
//	Can you call static data members in a static function ? Yes !!
	
// Can you call static function in non static function ? Yes !!
// Can you call non static function in static function ? NO!!
	
	public static void disp() {
		System.out.println(Total_num_students);
//		System.out.println(Age);
		
	}
	public void Agedisp() {
		System.out.println(Age);
	}
}
