package QPS_7;

public class Bottle {
	public static void main(String[] args) {
		int[][] mat = {{1,0,1,0},{1,1,0,0},{1,0,0,1},{0,1,0,1},{0,0,1,0}};
		int[] curr_keys = new int[mat[0].length];
		System.out.println(rec(mat, 0, curr_keys,""));
	}

	public static int rec(int[][] mat, int idx, int[] curr_keys,String str) {
//		Check for positive BS!!
		if (idx == mat.length) {
			for (int i = 0; i < mat[0].length; i++) {
				if(curr_keys[i]==0) {
					return 0;
				}
			}
			System.out.println(str);
			return 1;
		}

//		Add the Keys!!
		for (int i = 0; i < mat[0].length; i++) {
			curr_keys[i] = curr_keys[i] + mat[idx][i];
		}
		int sp1 = rec(mat, idx + 1, curr_keys,str+ ", B"+idx ); // Include, add the keys from the bottle idx

//		Remove the added keys!! Backtrack!!
		for (int i = 0; i < mat[0].length; i++) {
			curr_keys[i] = curr_keys[i] - mat[idx][i];
		}
		int sp2 = rec(mat, idx + 1, curr_keys,str); // Exclude

		return sp1 + sp2;
	}
}
