import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int arr[][];
	static boolean visited[][];
	static int N, cnt;
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(br.readLine());

		arr = new int[102][102];
		visited = new boolean[102][102];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[x][y] = 1;
		}
		dfs(0,0);
		int ans = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 1; j <= 100; j++) {
				if (arr[i][j] == 1) {
					for(int k = 0; k < 4; k++) 
					{
						int newi = i + dx[k];
						int newj = j + dy[k];
						if(arr[newi][newj] == 0 && visited[newi][newj] == true) ans++;
					}
				}
			}
		}
		System.out.println(ans);
	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			if (newx < 0 || newx > 101 || newy < 0 || newy > 101)
				continue;
			if (visited[newx][newy] == false && arr[newx][newy] == 0)
				dfs(newx, newy);
		}
	}

}
