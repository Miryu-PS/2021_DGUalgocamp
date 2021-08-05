import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int dist[][];
	static ArrayList<ArrayList<Integer>> graph;
	static int A, B, P, N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i <= N; i++)
			graph.add(new ArrayList<Integer>());

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int q = Integer.parseInt(st.nextToken());
			graph.get(p).add(q);
			graph.get(q).add(p);
		}

		dist = new int[N + 1][3];
		int[] arr = new int[] { 1, 2, N };
		for (int i = 0; i < 3; i++) {
			Queue<Integer> queue = new LinkedList<>();
			int start = arr[i];
			dist[start][i] = 1;
			queue.offer(start);
			while (!queue.isEmpty()) {
				int x = queue.poll();
				for (int y : graph.get(x)) {
					if (dist[y][i] == 0) {
						dist[y][i] = dist[x][i] + 1;
						queue.offer(y);
					}
				}
			}
		}
		long ans = Long.MAX_VALUE;
		for (int i = 1; i <= N; i++) {
			if (dist[i][0] == 0 || dist[i][1] == 0 || dist[i][2] == 0)
				continue;
			long tmp = (long) A * (dist[i][0] - 1) + B * (dist[i][1] - 1) + P * (dist[i][2] - 1);
			if (ans > tmp)
				ans = tmp;
		}
		System.out.println(ans);
	}

}
