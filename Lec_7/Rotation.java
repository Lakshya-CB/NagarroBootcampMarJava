package Lec_7;

public class Rotation {
	public static void main(String[] args) {
		int n = 123456;
		int rot = 12309;
		

		int nod = 0;
		int copy = n;
		while (copy != 0) {
			copy = copy / 10;
			nod = nod + 1;
		}
		rot=rot%nod;
		
//		System.out.println(nod);
//		System.out.println(copy);
		int div = (int) Math.pow(10, rot);
//		System.out.println(n);
		int p1 = n / div;
		int p2 = n % div;
//		System.out.println(p1+ " : "+p2);
		int mult = (int)Math.pow(10, nod-rot);
		System.out.println(p2 *mult+p1); 
		
	}
}
