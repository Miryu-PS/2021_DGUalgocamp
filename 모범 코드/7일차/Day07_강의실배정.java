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

		Collections.sort(arr, new Comparator<Integer[]>() { // 시작시간 기준 정렬
			public int compare(Integer[] p, Integer[] q) {
				if (p[0] == q[0])
					return p[1].compareTo(q[1]);
				return p[0].compareTo(q[0]);
			}
		});

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < N; i++) { // 시작시간이 빠른 강의부터 보면서, 강의를 할 수 있는 강의실이 없다면 새로운 강의실 개설
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
