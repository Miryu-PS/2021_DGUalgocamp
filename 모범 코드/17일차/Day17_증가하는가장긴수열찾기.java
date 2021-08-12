import java.io.*;
import java.util.*;

public class main {
	static int[] dp, arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		dp = new int[N + 1];
		arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int ans = 0;
		for (int i = 1; i <= N; i++) {
			dp[i] = 1;
			for (int j = 1; j < i; j++) {
				if (arr[j] < arr[i]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			ans = Math.max(dp[i], ans);
		}
		System.out.println(ans);
	}
}
