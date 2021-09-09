package Lec_Graph;

import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int num_V) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= num_V; i++) {
			map.put(i, new HashMap<Integer, Integer>());
		}
	}

	public void put(int V1, int V2, int wt) {
//		Create V1 to V2 with wt
		HashMap<Integer, Integer> edges_V1 = map.get(V1);
//		map.get(V1).put(V2, wt);
		edges_V1.put(V2, wt);

//		Create V2 to V1 with wt
		HashMap<Integer, Integer> edges_V2 = map.get(V2);
//		map.get(V1).put(V2, wt);
		edges_V2.put(V1, wt);

	}

	public void disp() {
//		System.out.println(map);
		for (int V : map.keySet()) {
			System.out.println(V + " - > " + map.get(V));
		}
		System.out.println("------------------------");
	}

	public boolean isNbr(int V1, int V2) {
		HashMap<Integer, Integer> edges_V1 = map.get(V1);
//		for(int nbr :  map.get(V1).keySet()) {
//			if(nbr==V2) {
//				return true;
//			}
//		}
//		return false;
		return edges_V1.containsKey(V2);
	}

	public void remove(int V1, int V2) {
		map.get(V1).remove(V2);
		map.get(V2).remove(V1);
	}

	public boolean hasPath(int src, int dest, HashSet<Integer> Visited, String ans) {
		Visited.add(src);
		if (src == dest) {
			System.out.println(ans);
			return true;
		}
		for (int nbr : map.get(src).keySet()) {
			if (!Visited.contains(nbr)) {
				boolean sp = hasPath(nbr, dest, Visited, ans + " to " + nbr);
				if (sp) {
					return true;
				}
			}
		}
		return false;
	}

	public void AllPath(int src, int dest, HashSet<Integer> Visited, String ans) {
		Visited.add(src);
		if (src == dest) {
			System.out.println(ans);
			Visited.remove(src);
			return;
		}
		for (int nbr : map.get(src).keySet()) {
			if (!Visited.contains(nbr)) {
				AllPath(nbr, dest, Visited, ans + " to " + nbr);
			}
		}
		Visited.remove(src);
		return;
	}

	public boolean BFS(int src, int dest) {
		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<>();
		Q.add(src);
		while (!Q.isEmpty()) {
			int Curr_V = Q.poll();
			if (Visited.contains(Curr_V)) {
				continue;
			}
			Visited.add(Curr_V);
//			self work!!
			System.out.println(Curr_V);

			if (dest == Curr_V) {
				return true;
			}
			for (int nbr : map.get(Curr_V).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
		return false;
	}

	public boolean isCycle_BFS() {
		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<>();
		int ans_num_com = 0;
		for (int src : map.keySet()) {
			if (Visited.contains(src)) {
				continue;
			}
			Q.add(src);
			while (!Q.isEmpty()) {
				int Curr_V = Q.poll();
				if (Visited.contains(Curr_V)) {
					return true;
//					continue;
				}
				Visited.add(Curr_V);
//			self work!!
				System.out.print(Curr_V + " ");

				for (int nbr : map.get(Curr_V).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
			System.out.println();
			ans_num_com++;
		}
		return false;
	}

	public int num_Components() {
		HashSet<Integer> Visited = new HashSet<Integer>();
		Queue<Integer> Q = new LinkedList<>();
		int ans_num_com = 0;
		for (int src : map.keySet()) {
			if (Visited.contains(src)) {
				continue;
			}
			Q.add(src);
			while (!Q.isEmpty()) {
				int Curr_V = Q.poll();
				if (Visited.contains(Curr_V)) {
					continue;
				}
				Visited.add(Curr_V);
//			self work!!
				System.out.print(Curr_V + " ");

				for (int nbr : map.get(Curr_V).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
			System.out.println();
			ans_num_com++;
		}
		return ans_num_com;
	}

	public boolean isTree() {
		return num_Components() == 1 && !isCycle_BFS();
	}

	class Dijkstra_Pair implements Comparable<Dijkstra_Pair>{
		int V;
		int path_cost;

		public Dijkstra_Pair(int VV, int D) {
			// TODO Auto-generated constructor stub
			V = VV;
			path_cost = D;
		}

		@Override
		public int compareTo(Dijkstra_Pair o) {
			// TODO Auto-generated method stub
			
			return this.path_cost-o.path_cost;
		}
	}

	public void Dijkstra(int src) {
		PriorityQueue<Dijkstra_Pair> PQ = new PriorityQueue<Dijkstra_Pair>();
		PQ.add(new Dijkstra_Pair(src, 0));
		HashSet<Integer> Visited = new HashSet<Integer>();
		while (!PQ.isEmpty()) {
			Dijkstra_Pair Curr = PQ.poll();
			if (Visited.contains(Curr.V)) {
				continue;
			}
			Visited.add(Curr.V);

			System.out.println(src + "  - " + Curr.V + " = " + Curr.path_cost);

			for (int nbr : map.get(Curr.V).keySet()) {
				if (!Visited.contains(nbr)) {
					int edge = Curr.path_cost + map.get(Curr.V).get(nbr);
					PQ.add(new Dijkstra_Pair(nbr, edge));
				}
			}
		}
	}
}
