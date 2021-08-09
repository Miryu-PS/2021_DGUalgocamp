import java.util.*;
import java.io.*;

public class main {

	static int N, M;
	static StringBuilder sb;
	static int[] arr;
	static boolean[] visit;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N + 1];
		visit = new boolean[N + 1];

		dfs(1);

		System.out.println(sb.toString());
	}

	public static void dfs(int x) { // arr[x]의 값을 할당할 차례, arr[1] ~ arr[M]
		if (x == M + 1) {
			for (int i = 1; i <= M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!visit[i]) {
				arr[x] = i;
				visit[i] = true;
				dfs(x + 1);
				arr[x] = 0; // backtrack
				visit[i] = false; // backtrack
			}
		}
	}
}