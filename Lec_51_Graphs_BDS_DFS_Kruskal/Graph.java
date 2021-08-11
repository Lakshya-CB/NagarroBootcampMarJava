package Lec_51_Graphs_BDS_DFS_Kruskal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

import Lec_42_43.Linked_List;

public class Graph {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int V) {
		// TODO Auto-generated constructor stub

		map = new HashMap<Integer, HashMap<Integer, Integer>>();
		for (int i = 1; i <= V; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void addEdge(int V1, int V2, int cost) {
		map.get(V1).put(V2, cost);
		map.get(V2).put(V1, cost);
	}

	public boolean containsEdge(int V1, int V2) {
		return map.get(V1).containsKey(V2) && map.get(V2).containsKey(V1);
	}

	public void removeEdge(int V1, int V2) {
		map.get(V1).remove(V2);
		map.get(V2).remove(V1);
	}

	public int TotalEdges() {
		int sum = 0;
		for (int V : map.keySet()) {
			sum += map.get(V).size();
		}
		return sum / 2;
	}

	public void Disp() {
		for (int V1 : map.keySet()) {
			System.out.println(V1 + "  ->  " + map.get(V1));
		}
	}

	public boolean hasPath(int src, int dest, HashSet<Integer> Visited, String str) {
//		System.out.println(src + " - " + dest);
		Visited.add(src);
		if (src == dest) {
			System.out.println(str);
			return true;
		}
		for (int nbr : map.get(src).keySet()) {
			if (!Visited.contains(nbr)) {
				boolean res = hasPath(nbr, dest, Visited, str + " " + src + " to");
				if (res) {
					return true;
				}
			}
		}
		return false;
	}

	public void AllPath(int src, int dest, HashSet<Integer> Visited, String str) {
//		System.out.println(src + " - " + dest);
//		Visited.add(src);
		if (src == dest) {
			System.out.println(str);
//			Visited.remove(src);
			return;
		}
		Visited.add(src);
		for (int nbr : map.get(src).keySet()) {
			if (!Visited.contains(nbr)) {
				AllPath(nbr, dest, Visited, str + " " + src + " to");

			}
		}
		Visited.remove(src);
		return;
	}

	public boolean BFS(int src, int dest) {
		HashSet<Integer> isPresentQ = new HashSet<>();
		Queue<Integer> Q = new LinkedList();

		Q.add(src);
		isPresentQ.add(src);
		String str = "";
		while (!Q.isEmpty()) {
			int V = Q.poll();
//			System.out.print(V + " ");
			if (V == dest) {
				return true;
			}

			for (int nbr : map.get(V).keySet()) {
				if (!isPresentQ.contains(nbr)) {
					Q.add(nbr);
					isPresentQ.add(nbr);
				}
			}

		}
		return false;
	}

	public boolean DFS(int src, int dest) {
		HashSet<Integer> isPresentS = new HashSet<>();
		Stack<Integer> Q = new Stack();

		Q.add(src);
		isPresentS.add(src);
		String str = "";
		while (!Q.isEmpty()) {
			int V = Q.pop();
//			System.out.print(V + " ");
			if (V == dest) {
				return true;
			}
			for (int nbr : map.get(V).keySet()) {
				if (!isPresentS.contains(nbr)) {
					Q.add(nbr);
					isPresentS.add(nbr);
				}
			}

		}
		return false;
	}

	public void BFT() {
		HashSet<Integer> isPresentQ = new HashSet<>();
		Queue<Integer> Q = new LinkedList();

//		int src = 1; 
		for (int src : map.keySet()) {
			if (isPresentQ.contains(src)) {
				continue;
			}

			Q.add(src);

			isPresentQ.add(src);

			while (!Q.isEmpty()) {
				int V = Q.poll();
				System.out.print(V + " ");

				for (int nbr : map.get(V).keySet()) {
					if (!isPresentQ.contains(nbr)) {
						Q.add(nbr);
						isPresentQ.add(nbr);
					}
				}

			}
		}
	}

	public void BFT2() {
		HashSet<Integer> Visited = new HashSet<>();
		Queue<Integer> Q = new LinkedList();

		for (int src : map.keySet()) {
			if (Visited.contains(src)) {
				continue;
			}
			Q.add(src);

			while (!Q.isEmpty()) {

				if (Visited.contains(Q.peek())) {
					Q.poll();
					continue;
				}

				int V = Q.poll();
				System.out.print(V + " ");
				Visited.add(V);

				for (int nbr : map.get(V).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}

			}
		}
		return;
	}

	public int numOfComponents() {
		HashSet<Integer> isPresentQ = new HashSet<>();
		Queue<Integer> Q = new LinkedList();
		int components = 0;
//		int src = 1; 
		for (int src : map.keySet()) {
			if (isPresentQ.contains(src)) {
				continue;
			}
			components++;
			Q.add(src);
			isPresentQ.add(src);
			while (!Q.isEmpty()) {
				int V = Q.poll();
				System.out.print(V + " ");

				for (int nbr : map.get(V).keySet()) {
					if (!isPresentQ.contains(nbr)) {
						Q.add(nbr);
						isPresentQ.add(nbr);
					}
				}
			}
			System.out.println("----------------------");

		}
		return components;
	}

	public boolean isCyclic() {
		HashSet<Integer> Visited = new HashSet<>();
		Queue<Integer> Q = new LinkedList();

		for (int src : map.keySet()) {
			if (Visited.contains(src)) {
				continue;
			}
			Q.add(src);

			while (!Q.isEmpty()) {
				if (Visited.contains(Q.peek())) {
					return true;
				}
				int V = Q.poll();
				System.out.print(V + " ");
				Visited.add(V);

				for (int nbr : map.get(V).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}

			}
		}
		return false;
	}

	public boolean isTree() {
		return numOfComponents() == 1 && !isCyclic();
	}

	public void getConnectedCompo() {
		HashSet<Integer> isPresentQ = new HashSet<>();
		ArrayList<ArrayList<Integer>> All_comp = new ArrayList<>();
		Queue<Integer> Q = new LinkedList();
		int components = 0;

		for (int src : map.keySet()) {
			if (isPresentQ.contains(src)) {
				continue;
			}
			components++;
			All_comp.add(new ArrayList<>());
			Q.add(src);
			isPresentQ.add(src);
			while (!Q.isEmpty()) {
				int V = Q.poll();
//					System.out.print(V + " ");
				All_comp.get(All_comp.size() - 1).add(V);
				for (int nbr : map.get(V).keySet()) {
					if (!isPresentQ.contains(nbr)) {
						Q.add(nbr);
						isPresentQ.add(nbr);
					}
				}
			}
//				System.out.println("----------------------");

		}
		System.out.println(All_comp);

	}

	class Disjoint {
		class TreeNode {
			int data;
			TreeNode parent;
			int rank;
		}

		HashMap<Integer, TreeNode> mapping = new HashMap<>();

//		O(V)
		public void create(int numV) {
			for (int i = 1; i <= numV; i++) {
				TreeNode n = new TreeNode();
				n.data = i;
				n.parent = n;
				n.rank = 0;
				mapping.put(i, n);
			}
		}

// O(ht) to O(1)
		public int find(int V0) {
//			Form the hashmap i got 2k
			TreeNode n = mapping.get(V0);
			return find(n).data;
		}

//		Will find the root node of my Tree set
		private TreeNode find(TreeNode n) {
			if (n.parent == n) {
				return n;
			}
			TreeNode rr = find(n.parent);
			n.parent = rr; // Path suppression for converting from O(ht) to Avg O(1)
			return rr;
		}

		public void Merge(int V1, int V2) {

			int RV1 = find(V1);
			int RV2 = find(V2);

//			O(1)

//			If Cycle Do not merge
			if (RV1 == RV2) {
				return;
			}

			TreeNode N1 = mapping.get(RV1);
			TreeNode N2 = mapping.get(RV2);
//			Case 1 : rank are same
			if (N1.rank == N2.rank) {
				N2.parent = N1;
				N1.rank++;
			} else if (N1.rank > N2.rank) {
				N2.parent = N1;
			} else {
				N1.parent = N2;
			}

		}

	}

	class EdgePair implements Comparable<EdgePair> {
		int Wt;
		int V1;
		int V2;

		public EdgePair(int w, int v1, int v2) {
			// TODO Auto-generated constructor stub
			Wt = w;
			V1 = v1;
			V2 = v2;
		}

		@Override
		public int compareTo(EdgePair o) {
			// TODO Auto-generated method stub
//			this - o;
			return this.Wt - o.Wt;
		}

		public String toString() {
			return " { " + V1 + "-" + V2 + "@" + Wt + " } ";
		}
	}

	public ArrayList<EdgePair> getAllEdges() {
		ArrayList<EdgePair> Al = new ArrayList<Graph.EdgePair>();
		for (int V1 : map.keySet()) {
//			All the nbr of V1
			for (int V2 : map.get(V1).keySet()) {
				int Wt = map.get(V1).get(V2);
				EdgePair P = new EdgePair(Wt, V1, V2);
				Al.add(P);
			}
		}
		return Al;
	}

	public void Kruskal() {
//		O(2*E)
		ArrayList<EdgePair> Edges = getAllEdges();

//		O(Elog(E))  ; E approx is VC2 =V2
//		O( 2E log (V) )
		Collections.sort(Edges);

//		System.out.println(Edges);

//		O(V)
		Disjoint Ds = new Disjoint();
		Ds.create(map.size());

//		O(E)
		for (EdgePair E : Edges) {
			int V1 = E.V1;
			int V2 = E.V2;

			int RV1 = Ds.find(V1);
			int RV2 = Ds.find(V2);

			if (RV1 == RV2) {
//				Same set!! Ignore!!
				continue;
			} else {
				System.out.println(E);
				Ds.Merge(RV1, RV2);
			}
		}
	}

	class PrimsPair implements Comparable<PrimsPair> {
		int Vname;
		int via_V;
		int cost;

		public PrimsPair(int dest, int from, int Wt) {
			// TODO Auto-generated constructor stub
			Vname = dest;
			via_V = from;
			cost = Wt;
		}

		public String toString() {
			return Vname + " via " + via_V + " @ " + cost;
		}

		@Override
		public int compareTo(PrimsPair o) {
//			this > o ?!					
			// TODO Auto-generated method stub

			return this.cost - o.cost;
//			return o.cost - this.cost; // This should be answer!!, dont forget PQ is a Min PQ

		}

	}

	public void Prims() {

		PriorityQueue<PrimsPair> PQ = new PriorityQueue<>();

		PrimsPair Starting = new PrimsPair(1, 0, 0);
		PQ.add(Starting);

		HashSet<Integer> visited = new HashSet<Integer>();

		while (!PQ.isEmpty()) {
//			O(log(X))
			PrimsPair Curr = PQ.poll();
//			if(Curr.Vname is Visited) {
			if (visited.contains(Curr.Vname)) {
				continue;
			}
//			Marked the Vertex as Visited
			visited.add(Curr.Vname);

			System.out.println(Curr);
//			IN total with Loop 1 , O(2E*log(V)) = O(Elog(V))
			for (int nbr : map.get(Curr.Vname).keySet()) {
				if (!visited.contains(nbr)) {
					System.out.println();
//					PQ.add(new PrimsPair(nbr,Curr.Vname,map.get(Curr.Vname).get(nbr)));

				}
			}

		}
	}

	class DijstraPair implements Comparable<DijstraPair> {
		int Vname;
		String PTN;
		int cost_TN;

		public DijstraPair(int dest, String from, int Wt) {
			// TODO Auto-generated constructor stub
			Vname = dest;
			PTN = from;
			cost_TN = Wt;
		}

		public String toString() {
			return Vname + " path " + PTN + " @ " + cost_TN;
		}

		@Override
		public int compareTo(DijstraPair o) {
			// TODO Auto-generated method stub
			return this.cost_TN - o.cost_TN;
		}

	}

	public void Dijstra(int src, int dest) {

		PriorityQueue<DijstraPair> PQ = new PriorityQueue<>();

		DijstraPair Starting = new DijstraPair(src, src + "", 0);

		PQ.add(Starting);

		HashSet<Integer> visited = new HashSet<Integer>();

		while (!PQ.isEmpty()) {
//			O(log(X))
			DijstraPair Curr = PQ.poll();
//			if(Curr.Vname is Visited) {
			if (visited.contains(Curr.Vname)) {
				continue;
			}
//			Marked the Vertex as Visited
			visited.add(Curr.Vname);

			
			if(Curr.Vname==dest) {
				System.out.println(Curr);
				return;
			}
			
			
//			IN total with Loop 1 , O(2E*log(V)) = O(Elog(V))
			for (int nbr : map.get(Curr.Vname).keySet()) {
				if (!visited.contains(nbr)) {
					
					PQ.add(new DijstraPair(nbr, Curr.PTN + nbr, Curr.cost_TN+map.get(Curr.Vname).get(nbr)));

				}
			}

		}
	}
}
