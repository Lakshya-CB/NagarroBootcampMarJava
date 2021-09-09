package Lec_Graph;

import java.util.HashSet;

public class Client {
	public static void main(String[] args) {
		Graph G= new Graph(7);
		G.put(1,4,2);
		G.put(1,2,6);
		G.put(2,3,5);
		G.put(3,4,3);
		G.put(5,4,1);
		G.put(5,6,6);
		G.put(5,7,4);
		G.put(6,7,2);
		G.Dijkstra(2);
		
//		G.disp();
		
//		G.put(1, 2, 44);
//		G.put(1, 4, 9);
////		G.put(3, 2, 4);
//		G.put(3, 4, 19);
//		
//		G.put(4, 5, 29);
//		
//		G.put(5, 6, 9);
//		G.put(5, 7, 20);
////		G.put(6, 7, 10);
		
		
//		
//		G.disp();
////		G.remove(3, 4);
////		G.disp();
////		G.hasPath(1,4,new HashSet<Integer>(),"1");
////		G.AllPath(1,7,new HashSet<Integer>(),"1");
////		System.out.println(G.BFS(1, 7));
////		System.out.println(G.num_Components());
////		System.out.println(G.isTree());
//		System.out.println(G.isCycle_BFS());
	}
}
