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

		Collections.sort(arr, new Comparator<Integer[]>() { // end 기준으로 오름차순 정렬
			public int compare(Integer[] p, Integer[] q) {
				if (p[1] == q[1])
					return p[0].compareTo(q[0]);
				return p[1].compareTo(q[1]);
			}
		});

		int ans = 0;
		int last = 0;
		for (int i = 0; i < N; i++) { // 종료시각이 빠른 회의부터 보면서, 진행할 수 있는 회의를 찾으면, 그 회의를 진행(진행할 수 있는 회의 중 종료시각이 가장 빠른 회의 선정)
			Integer[] tmp = arr.get(i);
			if (last <= tmp[0]) {
				last = tmp[1];
				ans++;
			}
		}
		System.out.println(ans);
	}
}