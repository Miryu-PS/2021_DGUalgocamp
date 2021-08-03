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

		arr = new int[N + 2][N + 2];
		visited = new boolean[N + 2][N + 2];

		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			for (int j = 1; j <= N; j++) {
				arr[i][j] = (int) (str.charAt(j - 1) - '0');
			}
		}
		ArrayList<Integer> ans = new ArrayList<>();

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (arr[i][j] == 1 && visited[i][j] == false) {
					cnt = 0;
					dfs(i, j);
					ans.add(cnt);
				}
			}
		}

		sb.append(ans.size() + "\n");
		Collections.sort(ans);
		for (int x : ans) {
			sb.append(x + "\n");
		}
		System.out.println(sb.toString());
	}

	public static void dfs(int x, int y) {
		visited[x][y] = true;
		cnt++;
		for (int i = 0; i < 4; i++) {
			int newx = x + dx[i];
			int newy = y + dy[i];
			if (newx < 1 || newx > N || newy < 1 || newy > N)
				continue;
			if (visited[newx][newy] == false && arr[newx][newy] == 1)
				dfs(newx, newy);
		}
	}

}
