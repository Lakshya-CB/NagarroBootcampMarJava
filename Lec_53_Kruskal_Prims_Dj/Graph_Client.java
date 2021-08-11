package Lec_53_Kruskal_Prims_Dj;

import java.util.HashSet;

public class Graph_Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 2, 10);
		G.addEdge(2, 3, 2);	
		G.addEdge(1, 4, 6);
		G.addEdge(3, 4, 3);
		G.addEdge(4, 5, 7);
		G.addEdge(5, 6, 9);
		G.addEdge(5, 7, 14);
		G.addEdge(6, 7, 13);
//		G.Disp();

//		System.out.println(G.hasPath(2, 6, new HashSet<>(),""));
//		
//		G.removeEdge(4, 5);
//		
//		System.out.println(G.hasPath(2, 6, new HashSet<>(),""));

//		G.AllPath(1, 6, new HashSet<>(), "");
//		G.BFS(1, 6);
//		G.BFT();
//		System.out.println(G.numOfComponents());
//		System.out.println(G.isCyclic());
//		G.BFT2();
//		System.out.println(G.isTree());
//		G.getConnectedCompo();
		G.Kruskal();
	}
}
