package Lec_51_Graphs_BDS_DFS_Kruskal;

import java.util.HashSet;

public class Graph_Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 2, 2);
		G.addEdge(2, 3, 3);	
		G.addEdge(1, 4, 10);
		G.addEdge(3, 4, 1);
		G.addEdge(4, 5, 8);
		G.addEdge(5, 6, 5);
		G.addEdge(5, 7, 6);
		G.addEdge(6, 7, 4);
		G.addEdge(6, 3, 10);
		G.addEdge(1, 7, 18);
		
		
		
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
//		G.Kruskal();
//		G.Prims();
		G.Dijstra(1, 7);
	}
}
