package Lec_19;

public class String_demo {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "bye";
		
		System.out.println(s1 + " : " + s2);
		
		s1=s2;
		System.out.println(s1 + " : " + s2);
		
		String s3 = new String("bye");
		String s4 = "bye";
		s3="Big_Word";
		//
		int size_s3=s3.length();
		System.out.println(size_s3);
		System.out.println(s1.charAt(0));
		System.out.println(s3.charAt(s3.length()-1));
		System.out.println(s3);
		//
		System.out.println("---------------");
		// substring(start,end);
		s1= "hello";
		System.out.println(s1.substring(0,1));
		System.out.println(s1.substring(0,4));
		System.out.println(s1.substring(0,s1.length()));
		System.out.println(s1.substring(0,0)+ "=:) ");
		String s5 = s1.substring(0,0);
		
//		s2 = "";
//		System.out.println(s2.length());
//		System.out.println(s1.substring(0,s1.length()+1)); wont work
		
		System.out.println(s1.substring(s1.length(),s1.length()));
		//
		
		// to get index of "ll"
		s1= "hello llo llo";
		System.out.println(s1.indexOf("ll"));  // found index beginning
		System.out.println(s1.indexOf("lol")); // if not, return -1;
		
		System.out.println("-------------");
		
		System.out.println(s1.lastIndexOf("ll"));
		System.out.println(s1.lastIndexOf("lol"));
		
		System.out.println("-------------");
		
		//concat
		
		System.out.println(s1+ s2);
		System.out.println(s1.concat(s2));
		s3 = s1 + s2;// new3
		s4 = s1.concat(s2); // new
		
		System.out.println("-------------");
		//startswith
		System.out.println(s1.startsWith("he"));
//		System.out.println(s1.startsWith("hoe"));
		boolean ans = s1.startsWith("hoe");
		System.out.println(ans);
		//
		System.out.println("-------------");
		System.out.println(s1.endsWith("llo"));
		System.out.println(s1.endsWith("lolo"));
		//
		System.out.println("-------------");
		String s01 = "hello";
		String s02 = "hello";
		String s03 = new String("hello");
		System.out.println(s01==s02);
		System.out.println(s03==s02);
		s03=s01;
		System.out.println("-------------");
		System.out.println(s03==s02);
		
		String s04 = new String("hello");
		System.out.println(s04.equals(s01));
		System.out.println(s04.equals(s02));
		
		
		System.out.println("-------------");
		String s05 = s04.replace('l', '0');
		System.out.println(s04);
		System.out.println(s05);
		
		//
		s1="aaaa";
		s2="bbbb";
		System.out.println(s2.compareTo(s1));
	}
}
