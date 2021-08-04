import java.util.*;
import java.io.*;

public class main {

	static int N, ans;
	static int[] arr;
	static boolean[] ver, diag1, diag2;
	// ver[x] == true -> 이미 칠한 (p,q)들 중 q == x 인 칸이 있다.
	// diag1[x] == true -> 이미 칠한 (p,q)들 중 (p+q) == x 인 칸이 있다.
	// diag2[x] == true -> 이미 칠한 (p,q)들 중 (p-q+N) == x 인 칸이 있다.

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		arr = new int[N + 1];
		ver = new boolean[N + 1];
		diag1 = new boolean[2 * N + 1];
		diag2 = new boolean[2 * N + 1];

		ans = 0;
		dfs(1);
		System.out.println(ans);
	}

	public static void dfs(int x) { // 위에서 x번째 줄의 몇 번째 칸에 넣을지 판단, 처음은 dfs(1)
		if (x == N + 1) {
			ans++;
			return;
		}
		for (int i = 1; i <= N; i++) { // x번째 줄에 i를 놓을 수 있는지 판단
			if (ver[i] || diag1[x + i] || diag2[x - i + N]) // (x, i)가 위쪽 줄과 서로 공격할 수 있는지 판단
				continue;

			ver[i] = diag1[x + i] = diag2[x - i + N] = true;
			dfs(x + 1);
			ver[i] = diag1[x + i] = diag2[x - i + N] = false; // backtrack
		}
	}
}