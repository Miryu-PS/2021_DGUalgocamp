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

		Collections.sort(arr, new Comparator<Integer[]>() { // 남은 기간 순으로 정렬
			public int compare(Integer[] p, Integer[] q) {
				return p[0].compareTo(q[0]);
			}
		});

		PriorityQueue<Integer> pq = new PriorityQueue<>(); // pq는 지금 진행중인 과제들의 점수 목록을 담고 있다.
		
		for (int i = 0; i < N; i++) { // 남은 기간이 짧은 것 먼저 살펴본다.
			Integer[] tmp = arr.get(i);
			int d = tmp[0], w = tmp[1]; // d일까지 진행할 점수 w의 과제
			if (pq.size() < d) // 만약 진행중인 과제가 d개 미만이라면 진행할 과제에 w 추가
				pq.offer(w);
			else { // 현재 진행중인 과제가 d개라면 진행중인 과제들 중 가장 점수가 작은 과제와 w 비교. w가 더 크다면 교체
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