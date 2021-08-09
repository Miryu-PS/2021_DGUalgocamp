import java.util.*;
import java.io.*;

public class main {

	static int N, M;
	static StringBuilder sb;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		sb = new StringBuilder();

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		arr = new int[N + 1];

		dfs(1, 1);

		System.out.println(sb.toString());
	}

	public static void dfs(int x, int p) { // arr[x]의 값을 p 이상으로 할당할 차례, arr[1] ~ arr[M]
		if (x == M + 1) {
			for (int i = 1; i <= M; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append("\n");
			return;
		}
		for (int i = p; i <= N; i++) {
			arr[x] = i;
			dfs(x + 1, i + 1);
			arr[x] = 0; // backtrack
		}
	}
}