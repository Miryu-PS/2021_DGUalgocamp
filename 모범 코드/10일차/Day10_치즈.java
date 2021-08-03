import java.io.*;
import java.util.*;

public class main {
	static int[][] arr;
	static int[][] visited;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		visited = new int[N][M];
		int cheese = 0;
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				int num = Integer.parseInt(st.nextToken());
				if (num == 1)
					cheese++;
				arr[i][j] = num;
			}
		}

		int ans = 0;
		while (cheese > 0) {
			ans++;
			visited = new int[N][M];
			dfs(0, 0);
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (arr[i][j] == 1 && visited[i][j] >= 2) {
						arr[i][j] = 0;
						cheese--;
					}
				}
			}
		}
		System.out.println(ans);
	}

	static void dfs(int x, int y) {
		visited[x][y] = -1;
		for (int i = 0; i < 4; i++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			if (newx < 0 || newy < 0 || newx >= N || newy >= M)
				continue;
			if (arr[newx][newy] == 1)
				visited[newx][newy]++;
			if (visited[newx][newy] == 0 && arr[newx][newy] == 0) {
				dfs(newx, newy);
			}
		}
	}
}
