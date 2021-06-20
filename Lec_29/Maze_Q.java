package Lec_29;

public class Maze_Q {
	public static void main(String[] args) {
		int[][] maze = { { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, 0, 1, 0 } };
		maze_karo(maze,new boolean[4][4], 0, 0, "");

	}

	public static void maze_karo(int[][] maze, boolean[][] visited, int row, int col, String ans) {

		if (row == -1 || row == maze.length || col == -1 || col == maze[0].length || maze[row][col] == 1
				|| visited[row][col]) {
			return;
		}
		if (row == maze.length - 1 && col == maze[0].length - 1) {
			System.out.println(ans);
			return;
		}
		visited[row][col] = true;
		maze_karo(maze, visited, row - 1, col, ans + "U");

		maze_karo(maze, visited, row + 1, col, ans + "D");

		maze_karo(maze, visited, row, col - 1, ans + "L");

		maze_karo(maze, visited, row, col + 1, ans + "R");
		visited[row][col] = false;

	}
}
