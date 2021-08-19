package Lec_52;

import java.util.Collections;
import java.util.Comparator;
import java.util.Queue;

public class Client {
	static class Student {
		String Name;
		int Age;
		int rank;

		public Student(int a, String n) {
			// TODO Auto-generated constructor stub
			Age = a;
			Name = n;
		}

		public Student(int a, String n, int r) {
			// TODO Auto-generated constructor stub
			Age = a;
			Name = n;
			rank = r;
		}
		public String toString() {
			return "Name : " + Name + " , Age : " + Age + " ; rank "+rank;
		}

//		@Override
		public int compareTo(Student o) {
//			5.compareTo(3); +ve
//			5-3;
//			this-o
			
//			if this is greater than o = positive;
//			else - ve;
			
			return o.rank - this.rank;
		}

		

	}
	static class RankComp implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			
			return 0;
		}

//		@Override
//		public int compare(Student o1, Student o2) {
//			// TODO Auto-generated method stub
//			return o2.rank-o1.rank;
//		}
		
	}
	class AgeComp implements Comparator<Student>{

		@Override
		public int compare(Student o1, Student o2) {
			// TODO Auto-generated method stub
			return o1.Age-o2.Age;
		}
		
	}
	public static void main(String[] args) {

		Student[] arr2 = new Student[4];
		arr2[0] = new Student(100, "A",10);
		arr2[1] = new Student(21, "B",9);
		arr2[2] = new Student(101, "C",11);
		arr2[3] = new Student(10, "D",15);
		arr2[3] = new Student(120, "E",5);
		Client C = new Client();
		sort(arr2, C.new AgeComp());
//		disp(arr2);
		BST<Student> BS = new BST<>(arr2);
		BS.Disp();
		Collections.sort(null);
	}

	public static <OO1> void disp(OO1[] arr) {
		for (OO1 lol : arr) {
			System.out.println(lol);
		}
	}

	public static <OO>void sort(OO[] arr, Comparator<OO> obj) {
		
		for(int count =0;count<arr.length-1;count++) {
			for(int i=0;i<arr.length-count-1;i++) {
				
//				if(arr[i]>arr[i+1]) {
//				if(arr[i].compareTo(arr[i+1])>0) {
//					Swap
				if(obj.compare(arr[i],arr[i+1])>0) {
					OO temp = arr[i];
					
					arr[i]= arr[i+1];
					arr[i+1]= temp;
				}
			}
		}
	}
	public static <OO extends Comparable>void sort(OO[] arr) {
		
		for(int count =0;count<arr.length-1;count++) {
			for(int i=0;i<arr.length-count-1;i++) {
				
//				if(arr[i]>arr[i+1]) {
				if(arr[i].compareTo(arr[i+1])>0) {
//					Swap
//				if(obj.compare(arr[i],arr[i+1])>0) {
					OO temp = arr[i];
					
					arr[i]= arr[i+1];
					arr[i+1]= temp;
				}
			}
		}
	}

}
