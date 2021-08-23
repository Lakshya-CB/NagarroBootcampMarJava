package Lec_Hashmap_Imple;

public class Client {
	public static void main(String[] args) {
		HashMap<String, Integer> map= new HashMap<>();
		map.put("A",10);
		map.put("B",20);
		map.put("C",30);
		map.put("D",40);
		map.put("C",300);
		map.put("DD",400);

		map.put("CC",300);
		map.put("DD1",400);

		map.put("DD11",400);

		map.put("DP1",400);
		map.put("D3P1",400);map.put("DP12",400);
		map.disp();
	}
}
