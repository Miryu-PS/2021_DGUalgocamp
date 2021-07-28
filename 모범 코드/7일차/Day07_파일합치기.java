import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			pq.offer(x);
		}

		int ans = 0;

		while (pq.size() > 1) { // 가장 작은 2개의 파일을 합치는 것을 반복
			int x = pq.poll();
			int y = pq.poll();
			ans += (x + y);
			pq.offer(x + y);
		}
		System.out.println(ans);
	}
}