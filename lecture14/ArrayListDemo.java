package lecture14;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		Integer a =  null;
		al.add(a);
		
		al.add(1);
		al.add(2);
		al.add(3);
		
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(3, 10);
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(3));
		
		al.set(0, 10);
		System.out.println(al);
		
//		al.remove(1);
		
		
		System.out.println(al);
		System.out.println(al.size());
		
		
		for(int i = 0; i < al.size(); i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();

		for(int val : al)
		{
			System.out.print(val+" ");
		}

	}

}
