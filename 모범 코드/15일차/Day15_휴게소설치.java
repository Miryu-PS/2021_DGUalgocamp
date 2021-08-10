import java.io.*;
import java.util.*;

public class main {
	static int N, M, L;
	static ArrayList<Integer> arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		arr = new ArrayList<Integer>();
		if (N != 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			Collections.sort(arr);
		}
		int l = 1, r = L;
		while (l < r) {
			int mid = (l + r) / 2;
			if (chk(mid))
				r = mid; // mid의 거리를 두고 설치 가능하다면 mid 이하에서 검사. [l,r] -> [l, mid]
			else
				l = mid + 1; // mid의 거리를 두고 설치 불가능하면 더 짧은 거리에서 시도. [l,r] -> [l, mid-1]
		}
		System.out.println(l);
	}

	public static boolean chk(int x) {
		int now = 0, cnt = 0;
		for (int i = 0; i < N; i++) {
			int tmp = arr.get(i) - now;
			cnt += (tmp - 1) / x;
			now = arr.get(i);
		}
		cnt += (L - now - 1) / x;
		if (cnt <= M) {
			return true;
		} else
			return false;
	}
}