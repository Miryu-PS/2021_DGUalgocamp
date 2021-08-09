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

		int l = 1, r = N; // ���� �����ϴ� ������ l �̻� r �����̴�.

		while (l < r) {// ������ 1���� ũ�� �ݺ�
			int mid = (l + r) / 2;
			if (arr[mid] < K) { // ã���� �ϴ� ������ midĭ�� ���� ������ ���� mid+1 ~ r ������ �ִ�.
				l = mid + 1;
			} else if (arr[mid] > K) { // ã���� �ϴ� ������ midĭ�� ���� ũ�� ���� l ~ mid ������ �ִ�. (mid�� ���� �� �� ������ ��������)
				r = mid;
			} else if (arr[mid] == K) { // ã���� �ϴ� ���� midĭ�� ���� ������ ���� l ~ mid ������ �ִ�. (���ʿ� K���� �� ���� ���� �ִ�.)
				r = mid;
			}
		}
		// �ݺ����� ������ l==r ������ ���̰� 1�� �Ǿ� ������.
		System.out.println(l);
	}
}