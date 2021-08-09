import java.io.*;
import java.util.*;

public class main {
	static int N, M;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		for (int i = 0; i < M; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int l = 0, r = 1000000000;

		while (l < r) {
			int mid = (l + r + 1) / 2; // mid = (l+r)/2 �� ��� ���ѷ���
			if (chk(mid))
				l = mid; // ũ�� mid�� �߶� N���� ������ �� �ִٸ� mid �̻��� ũ��� �߶� �ȴ�. [l,r] -> [mid, r]
			else
				r = mid - 1; // mid�� �ڸ� ��� ������ �� ������ mid���� �۰� �߶�� �Ѵ�. [l,r] -> [l, mid-1]
		}

		System.out.println(l);
	}

	public static boolean chk(int x) {
		if (x == 0)
			return true;
		long sum = 0;
		for (int i = 0; i < M; i++) {
			sum += (arr[i] / x);
		}
		if (sum >= (long) N) {
			return true;
		} else
			return false;
	}
}