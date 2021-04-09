package Lec_3;

import java.util.Scanner;

public class Report_2 {
public static void main(String[] args) {
	Scanner scn1 = new Scanner(System.in);
	int marks = scn1.nextInt();
//	int marks = 61;
	System.out.println("Ho gya input = "+marks);
	if(marks >90 &&  marks <=100) {
		System.out.println("A" );
	}
	else if(marks >80 ) {
		System.out.println("B" );
	}
	else if(marks>70){
		System.out.println("C");
	}
	else if(marks>60){
		System.out.println("D");
	}
	else {
		System.out.println("E");
	}
}

}
