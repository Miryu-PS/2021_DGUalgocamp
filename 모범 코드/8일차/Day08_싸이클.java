import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int visited[];
	static int N, P, ans;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());

		visited = new int[1001];

		dfs(N, 1); // 현재 수 N, 방문한 회차 = 1
		System.out.println(ans);
	}

	public static void dfs(int x, int round) {
		if (visited[x] == 0) {
			visited[x] = round;
			dfs((x * N) % P, round + 1);
		} else {
			ans = round - visited[x];
		}
	}
}
