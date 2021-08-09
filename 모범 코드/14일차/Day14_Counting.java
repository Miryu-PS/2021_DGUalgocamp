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

		arr.add(Integer.MAX_VALUE); // ��� ���� ���Ϸ��� ������ Ŭ ��, �ڵ����� N�� return�ϱ� ���� arr�� n�� ��ġ�� max_value�� add

		Collections.sort(arr);
		for (int i = 0; i < Q; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			// A �̻��� ���� ó�� ��Ÿ���� ��ġ ã��
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

			// B �ʰ��� ���� ó�� ��Ÿ���� ��ġ ã��
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