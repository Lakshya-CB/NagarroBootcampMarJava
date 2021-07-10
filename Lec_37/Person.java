package Lec_37;

public class Person {
	private String name = "Sir Sardar Khan Sign UFC Champ";
	private int age = 10;

	public Person(String maze) {
		// TODO Auto-generated constructor stub
		name = "CCC";
//		String name = "asdf";
//		System.out.println(maze+" asdfsda");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		
		try {
			if(age>10) {
				throw new Exception();
			}
			return age;
		}
		catch(Exception e){
			System.out.println("error");
			return age;
		}
		finally {
			System.out.println("LOLOLOLOL");
		}
		
	}

	public void setAge(int age) {
		try {
			if (age < 0) {
				throw new RuntimeException("Bna hoti");
			}
			this.age = age;
		} catch (Exception e) {
			System.out.println("Maar diya ?!");
		}
//		System.out.println("Update kar rha hein bhai");
////			fekh ke maaru error!!
//		try {
//			this.age = age;
//			if (age < 0) {
//				throw new Exception("Bna hoti");
//			}
//			System.out.println("ABABBABABA");
//			throw new Exception("Bna hoti");
//
//		} catch (Exception e) {
////			Resolving the exception!! 
//			System.out.println(e.get	Message());
//			e.printStackTrace();
//			this.age = 0;
//			System.out.println("Exception throw hui thi !!!");
//			System.out.println("Last line in Catch");
//		}
		
//		System.out.println("End of code after try catch");

	}

}
