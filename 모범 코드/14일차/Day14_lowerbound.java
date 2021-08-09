import java.io.*;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int K = Integer.parseInt(br.readLine());
		if (arr[N] < K) {
			System.out.println(N + 1);
			return;
		}

		int l = 1, r = N; // 답이 존재하는 구간은 l 이상 r 이하이다.

		while (l < r) {// 구간이 1보다 크면 반복
			int mid = (l + r) / 2;
			if (arr[mid] < K) { // 찾고자 하는 수보다 mid칸의 수가 작으면 답은 mid+1 ~ r 구간에 있다.
				l = mid + 1;
			} else if (arr[mid] > K) { // 찾고자 하는 수보다 mid칸의 수가 크면 답은 l ~ mid 구간에 있다. (mid도 답이 될 수 있음에 유의하자)
				r = mid;
			} else if (arr[mid] == K) { // 찾고자 하는 수가 mid칸의 수와 같으면 답은 l ~ mid 구간에 있다. (앞쪽에 K값이 더 나올 수도 있다.)
				r = mid;
			}
		}
		// 반복문이 끝나면 l==r 구간의 길이가 1이 되어 끝난다.
		System.out.println(l);
	}
}