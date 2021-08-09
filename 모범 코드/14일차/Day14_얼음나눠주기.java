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
			int mid = (l + r + 1) / 2; // mid = (l+r)/2 일 경우 무한루프
			if (chk(mid))
				l = mid; // 크기 mid로 잘라서 N명에게 나눠줄 수 있다면 mid 이상의 크기로 잘라도 된다. [l,r] -> [mid, r]
			else
				r = mid - 1; // mid로 자른 경우 나눠줄 수 없으면 mid보다 작게 잘라야 한다. [l,r] -> [l, mid-1]
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