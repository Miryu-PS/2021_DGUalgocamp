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
			int d = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			arr.add(new Integer[] { d, w });
		}

		Collections.sort(arr, new Comparator<Integer[]>() { // ���� �Ⱓ ������ ����
			public int compare(Integer[] p, Integer[] q) {
				return p[0].compareTo(q[0]);
			}
		});

		PriorityQueue<Integer> pq = new PriorityQueue<>(); // pq�� ���� �������� �������� ���� ����� ��� �ִ�.
		
		for (int i = 0; i < N; i++) { // ���� �Ⱓ�� ª�� �� ���� ���캻��.
			Integer[] tmp = arr.get(i);
			int d = tmp[0], w = tmp[1]; // d�ϱ��� ������ ���� w�� ����
			if (pq.size() < d) // ���� �������� ������ d�� �̸��̶�� ������ ������ w �߰�
				pq.offer(w);
			else { // ���� �������� ������ d����� �������� ������ �� ���� ������ ���� ������ w ��. w�� �� ũ�ٸ� ��ü
				int minw = pq.peek();
				if (minw < w) {
					pq.poll();
					pq.offer(w);
				}
			}
		}
		int ans = 0;
		while (!pq.isEmpty()) {
			int x = pq.poll();
			ans += x;
		}
		System.out.println(ans);
	}
}