package Lec_52;

public class Client_2 {
	public static void main(String[] args) {
		
		System.out.println(Student.Total_num_students);
		Student.disp();
		
		Student S1 = new Student(10, "A");
		Student S2 = new Student(10, "A");
		Student S3 = new Student(10, "A");
		Student S4 = new Student(10, "A");
		
		System.out.println(S1.Total_num_students);
		System.out.println(S2.Total_num_students);
		System.out.println(S3.Total_num_students);
		System.out.println(S4.Total_num_students);
			
	}
}
