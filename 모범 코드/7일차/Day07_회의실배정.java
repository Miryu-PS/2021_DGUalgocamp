import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer[]> arr = new ArrayList<Integer[]>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			arr.add(new Integer[] { start, end });
		}

		Collections.sort(arr, new Comparator<Integer[]>() { // end �������� �������� ����
			public int compare(Integer[] p, Integer[] q) {
				if (p[1] == q[1])
					return p[0].compareTo(q[0]);
				return p[1].compareTo(q[1]);
			}
		});

		int ans = 0;
		int last = 0;
		for (int i = 0; i < N; i++) { // ����ð��� ���� ȸ�Ǻ��� ���鼭, ������ �� �ִ� ȸ�Ǹ� ã����, �� ȸ�Ǹ� ����(������ �� �ִ� ȸ�� �� ����ð��� ���� ���� ȸ�� ����)
			Integer[] tmp = arr.get(i);
			if (last <= tmp[0]) {
				last = tmp[1];
				ans++;
			}
		}
		System.out.println(ans);
	}
}