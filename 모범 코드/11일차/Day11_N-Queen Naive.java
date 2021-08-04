import java.util.*;
import java.io.*;

public class main {

	static int N, ans;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		arr = new int[N + 1];
		ans = 0;

		dfs(1);

		System.out.println(ans);
	}

	public static void dfs(int x) { // ������ x��° ���� �� ��° ĭ�� ������ �Ǵ�
		if (x == N + 1) {
			ans++;
			return;
		}
		for (int i = 1; i <= N; i++) { // x��° �ٿ� i�� ���� �� �ִ��� �Ǵ�
			boolean pos = true;
			for (int j = 1; j < x; j++) {// ���� �ٰ� ���� ������ �� �ִ��� �Ǵ�
				// (j, arr[j])�� (x, i)
				if (i == arr[j] || j - arr[j] == x - i || j + arr[j] == x + i)
					pos = false;
			}

			if (pos) {
				arr[x] = i;
				dfs(x + 1);
				arr[x] = 0; // backtrack
			}
		}
	}
}