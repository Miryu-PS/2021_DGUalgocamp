import java.io.*;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken());
		int Q = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}

		arr.add(Integer.MAX_VALUE); // 모든 수가 구하려는 수보다 클 때, 자동으로 N을 return하기 위해 arr의 n번 위치에 max_value를 add

		Collections.sort(arr);
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			// A 이상의 수가 처음 나타나는 위치 찾기
			int l = 0, r = N;
			while (l < r) {
				int mid = (l + r) / 2;
				if (arr.get(mid) < A) {
					l = mid + 1;
				}
				else {
					r = mid;
				}
			}
			int A_lb = l;

			// B 초과의 수가 처음 나타나는 위치 찾기
			l = 0;
			r = N;
			while (l < r) {
				int mid = (l + r) / 2;
				if (arr.get(mid) <= B) {
					l = mid + 1;
				}
				else {
					r = mid;
				}
			}
			int B_ub = l;
			System.out.println((B_ub - A_lb) + "\n");
		}

	}
}