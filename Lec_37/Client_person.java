package Lec_37;

public class Client_person {
	public static void main(String[] args){
		Person pp = new Person("maze ");
		pp.setAge(11);
		
		
//		try {
//			pp.setAge(-10);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Got error did nto update the Age");
//		}
		System.out.println(pp.getAge());
	}
	
}
