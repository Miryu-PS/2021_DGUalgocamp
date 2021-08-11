import java.io.*;
import java.util.*;

public class main {
	static int[] dp, arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int X = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		final int mod = 1000000007;
		dp = new int[N + 1];
		arr = new int[X + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < X; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dp[0] = 1;
		for (int i = 1; i <= N; i++) {
			dp[i] = 0;
			for (int j = 0; j < X; j++) {
				if (i - arr[j] >= 0) {
					dp[i] += dp[i - arr[j]];
					dp[i] %= mod;
				}
			}
		}
		System.out.println(dp[N]);
	}
}
