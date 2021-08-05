import java.util.*;
import java.io.*;

public class main {

	static int N, M, V;
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visit;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());

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
		visit = new boolean[N + 1];
		for (int i = 1; i <= N; i++)
			Collections.sort(graph.get(i)); // 정점번호가 작은 정점부터 방문하기 위해 정렬 

		dfs(V);
		sb.append("\n");

		Queue<Integer> queue = new LinkedList<>();
		visit = new boolean[N + 1];

		queue.offer(V); // 큐에 처음 점 V를 offer
		visit[V] = true; // visit 배열은 방문 여부보다는 큐에 들어간 적 있는지 여부를 확인한다.(중복 offer 방지)
		while (!queue.isEmpty()) {
			int x = queue.poll(); // queue에서 꺼낸 값 x
			sb.append(x + " "); // x를 출력
			for (int y : graph.get(x)) { // x와 인접한 y
				if (!visit[y]) { // y를 큐에 넣은 적이 없다면
					queue.offer(y); // y를 queue에 넣고 visit에 체크
					visit[y] = true;
				}
			}
		}
		System.out.println(sb.toString());
	}

	public static void dfs(int x) {
		visit[x] = true;
		sb.append(x + " ");
		for (int y : graph.get(x)) {
			if (!visit[y]) {
				dfs(y);
			}
		}
	}
}