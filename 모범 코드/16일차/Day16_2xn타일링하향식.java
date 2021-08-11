import java.io.*;
import java.util.*;

public class main {
	static int[] dt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] dt = new int[N + 1];

		System.out.println(dp(N));
	}

	public static int dp(int x) {
		if (dt[x] != 0)
			return dt[x];
		if (x == 1)
			return 1;
		if (x == 2)
			return 2;
		return dt[x] = (dp(x - 1) + dp(x - 2)) % 10007;
	}
}
