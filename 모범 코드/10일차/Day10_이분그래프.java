import java.util.*;
import java.io.*;

public class main {
	static ArrayList<ArrayList<Integer>> graph;
	static int[] color;
	static boolean pos;

	public static void dfs(int x, int c) {
		color[x] = c;
		for (int y : graph.get(x)) {
			if (color[y] == color[x])
				pos = false;
			if (color[y] == 0) {
				dfs(y, 3 - c);
			}
		}
	}

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			graph.get(u).add(v);
			graph.get(v).add(u);
		}

		color = new int[N + 1];
		pos = true;

		for (int i = 1; i <= N; i++) {
			if (color[i] == 0)
				dfs(i, 1);
		}
		if (pos)
			System.out.println("YES");
		else
			System.out.println("NO");

	}

}