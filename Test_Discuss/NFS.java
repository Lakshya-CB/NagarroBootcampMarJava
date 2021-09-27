package Test_Discuss;

import java.nio.file.Path;
import java.util.ArrayList;

public class NFS {
	public static void main(String[] args) {
		int in1 = 7;
		String[] in2 = { "None", "Cop", "Sand", "None", "Nitro", "None", "None" };
		int in3 = 8;
		int[][] paths = { { 0, 1 }, { 0, 2 }, { 1, 2 }, { 2, 3 }, { 2, 4 }, { 3, 6 }, { 4, 5 }, { 5, 6 } };
		ArrayList<ArrayList<Integer>> map = new ArrayList<ArrayList<Integer>>();
//		Add all the vertex
		for (int v = 0; v < in1; v++) {
			map.add(new ArrayList<>());
		}
//		Add all the edges!!
		for (int[] edges : paths) {
			map.get(edges[0]).add(edges[1]);
		}
		all("0 ", map, in2, 0, 0, false, false);
	}

	public static void all(String path, ArrayList<ArrayList<Integer>> map, String[] pow, int Curr_pos, double time,
			boolean nos, boolean sand) {
		if (Curr_pos == map.size() - 1) {
			System.out.println(path + "     " + time);
			return;
		}
		for (int nbr : map.get(Curr_pos)) {
			if (pow[Curr_pos].equals("None")) {
				double temp_time = 1;
				if (sand) {
					temp_time = temp_time * 2;
				}
				if (nos) {
					temp_time = temp_time / 2;
				}
				all(path + nbr + " ", map, pow, nbr, temp_time + time, false, false);
			} else if (pow[Curr_pos].equals("Sand")) {
				double temp_time = 2;
				if (nos) {
					temp_time = temp_time / 2;
				}
				all(path + nbr + " ", map, pow, nbr, temp_time + time, false, true);
			} else if (pow[Curr_pos].equals("Nitro")) {
				double temp_time = 0.5;

				if (sand) {
					temp_time = temp_time * 2;
				}

				all(path + nbr + " ", map, pow, nbr, temp_time + time, true, false);
			}
		}
	}
}
