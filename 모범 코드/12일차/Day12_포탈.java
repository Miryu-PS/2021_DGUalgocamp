import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int dist[];
	static int X, Y;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		dist = new int[200001];

		Queue<Integer> queue = new LinkedList<>();
		dist[X] = 1; // 배열 전체를 -1로 초기화하거나, dist[X]를 1로 설정한 후 dist[Y]-1 출력
		queue.offer(X);

		while (!queue.isEmpty()) {
			int x = queue.poll();
			if (x + 1 <= 200000 && dist[x + 1] == 0) {
				dist[x + 1] = dist[x] + 1;
				queue.offer(x + 1);
			}
			if (x - 1 >= 0 && dist[x - 1] == 0) {
				dist[x - 1] = dist[x] + 1;
				queue.offer(x - 1);
			}
			if (2 * x <= 200000 && dist[2 * x] == 0) {
				dist[2 * x] = dist[x] + 1;
				queue.offer(2 * x);
			}
		}
		System.out.println(dist[Y] - 1);
	}

}
