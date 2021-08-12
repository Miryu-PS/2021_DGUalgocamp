import java.io.*;
import java.util.*;

public class main {
	static Long[][] dp;
	static int[] w, v;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int W = Integer.parseInt(st.nextToken());

		dp = new Long[N + 1][W + 1];
		w = new int[N + 1];
		v = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());
		}

		dp[0][0] = 0L;
		for (int i = 1; i <= W; i++)
			dp[0][i] = -1L;

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= W; j++) {
				dp[i][j] = dp[i - 1][j];
				if (j - w[i] >= 0) {
					dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - w[i]] + v[i]);
				}
			}
		}

		Long ans = 0L;
		for (int i = 0; i <= W; i++) {
			ans = Math.max(dp[N][i], ans);
		}
		System.out.println(ans);
	}
}
