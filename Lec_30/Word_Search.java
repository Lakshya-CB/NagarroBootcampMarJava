package Lec_30;

public class Word_Search {
	static boolean flag = false;
	public static void main(String[] args) {
		char[][] maze = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'A', 'B' }, { 'A', 'B', 'C', 'D' } };
		String word = "AB";
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[0].length;j++) {
				if(maze[i][j]==word.charAt(0)) {
					maze_karo(maze, new boolean[maze.length][maze[0].length], i, j, "", word, 0);
//					if(flag) {
//						return true;
//					}
				}
			}
		}
//		return false;
	}

	public static void maze_karo(char[][] maze, boolean[][] visited, int row, int col, String ans, String tofind,
			int index) {

		
		
		if (row == -1 || row == maze.length || col == -1 || col == maze[0].length
				|| maze[row][col] != tofind.charAt(index) || visited[row][col]) {
			return;
		}
		// +ve BC??
		if (index == tofind.length()-1) {
//			System.out.println(maze[row][col]);
//			System.out.println(ans);
			flag = true;
			return;
		}

		visited[row][col] = true;
		maze_karo(maze, visited, row - 1, col, ans + maze[row][col], tofind, index + 1);

		maze_karo(maze, visited, row + 1, col, ans + maze[row][col], tofind, index + 1);

		maze_karo(maze, visited, row, col - 1, ans  + maze[row][col], tofind, index + 1);

		maze_karo(maze, visited, row, col + 1, ans  + maze[row][col], tofind, index + 1);
		visited[row][col] = false;

	}
}
