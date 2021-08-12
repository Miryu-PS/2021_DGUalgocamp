import java.io.*;
import java.util.*;

public class main {
	static int[][] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1][3];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int z = Integer.parseInt(st.nextToken());
			dp[i][0] = Math.max(dp[i - 1][1], dp[i - 1][2]) + x;
			dp[i][1] = Math.max(dp[i - 1][0], dp[i - 1][2]) + y;
			dp[i][2] = Math.max(dp[i - 1][0], dp[i - 1][1]) + z;
		}
		System.out.println(Math.max(dp[N][0], Math.max(dp[N][1], dp[N][2])));
	}
}
