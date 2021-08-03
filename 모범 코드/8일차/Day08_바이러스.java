import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static ArrayList<ArrayList<Integer>> Graphlist;
	static boolean visited[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		Graphlist = new ArrayList<ArrayList<Integer>>();
		visited = new boolean[N + 1];

		// Graph 인접행렬 만들기
		for (int i = 0; i <= N; i++)
			Graphlist.add(new ArrayList<Integer>());
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			Graphlist.get(p).add(q);
			Graphlist.get(q).add(p);
		}

		dfs(1);

		int ans = 0;
		for (int i = 2; i <= N; i++) {
			if (visited[i]) {
				ans++;
			}
		}
		System.out.println(ans);

	}

	public static void dfs(int x) {
		visited[x] = true;
		for (int y : Graphlist.get(x)) {
			if (visited[y] == false) {
				dfs(y);
			}
		}
	}
}
