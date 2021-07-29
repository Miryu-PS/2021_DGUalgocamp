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

		Collections.sort(arr, new Comparator<Integer[]>() { // ���۽ð� ���� ����
			public int compare(Integer[] p, Integer[] q) {
				if (p[0] == q[0])
					return p[1].compareTo(q[1]);
				return p[0].compareTo(q[0]);
			}
		});

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) { // ���۽ð��� ���� ���Ǻ��� ���鼭, ���Ǹ� �� �� �ִ� ���ǽ��� ���ٸ� ���ο� ���ǽ� ����
			Integer[] tmp = arr.get(i);
			if (pq.isEmpty() || pq.peek() > tmp[0]) {
				pq.offer(tmp[1]);
			} 
			else {
				pq.poll();
				pq.offer(tmp[1]);
			}
		}
		System.out.println(pq.size());
	}
}
