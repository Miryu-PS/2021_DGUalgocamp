import java.io.*;
import java.util.*;

public class main {
	static int[][] dp, arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		final int mod = 1000000007;
		dp = new int[N + 1][N + 1];
		arr = new int[N + 1][N + 1];

		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			for (int j = 1; j <= N; j++) {
				if (str.charAt(j - 1) == '.')
					arr[i][j] = 1;
				else
					arr[i][j] = 0;
			}
		}

		if (arr[1][1] == 1)
			dp[1][1] = 1;
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == 1 && j == 1)
					continue;
				dp[i][j] = 0;
				if (arr[i][j] == 0)
					continue;
				dp[i][j] = (dp[i - 1][j] + dp[i][j - 1]) % mod;
			}
		}
		System.out.println(dp[N][N]);
	}
}
