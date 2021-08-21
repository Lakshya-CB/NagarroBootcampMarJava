package Lec_54_Heap_HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class demo_Hash_Map {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
//			<Key , Value >
//		O(1)

		map.put("BA2", 20);
		map.put("A1", 10);
		map.put("A2", 20);
		map.put("ZA3", 30);
		map.put("LLA4", 40);
		map.put("A3", 30);
		map.put("A4", 40);
		
//		Values are not stored in the input order
		System.out.println(map);
		
//		Same key in put , Value will be updated!!
		map.put("A1", 999990);
		System.out.println(map);
		
//		IN the map, you can find the pair via key value!!
		System.out.println(map.containsKey("A40"));
		
//		remove!! O(1)
		System.out.println(map.remove("A1"));
		System.out.println(map.remove("A1111"));
		
		
//		To find each Key in your map!!
//		A 1 
		System.out.println(map.keySet());
//		A 2
		Set<String> Keys = map.keySet();
		
		System.out.println(Keys);
//		A 4
		for(String key : Keys) {
			System.out.print(key+ " ");
		}
		System.out.println();
//		A 3
		for(String key : map.keySet()) {
			System.out.print(key+ " ");
		}
		System.out.println();
		
//		Convert Set to AL!!
		ArrayList<String> key_AL = new ArrayList<>(map.keySet());
		System.out.println(key_AL);
	}
}
