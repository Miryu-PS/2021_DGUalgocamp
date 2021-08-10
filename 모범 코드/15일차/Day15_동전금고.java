import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int arr[][];
	static boolean visit[][];
	static int N, M, cnt;
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[M + 1][N + 1];

		for (int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		int l = 0, r = 1000000000;
		while (l < r) {
			int mid = (l + r) / 2;
			if (bfs(mid))
				r = mid;
			else
				l = mid + 1;
		}
		System.out.println(l);
	}

	public static boolean bfs(int t) {
		Queue<Integer[]> queue = new LinkedList<>();
		visit = new boolean[M + 1][N + 1];
		queue.offer(new Integer[] { 1, 1 });
		visit[1][1] = true;

		while (!queue.isEmpty()) {
			Integer[] tmp = queue.poll();
			int x = tmp[0], y = tmp[1];
			for (int i = 0; i < 4; i++) {
				int newx = x + dx[i], newy = y + dy[i];
				if (newx < 1 || newx > M || newy < 1 || newy > N)
					continue;
				if (arr[newx][newy] <= arr[x][y] + t && visit[newx][newy] == false) {
					visit[newx][newy] = true;
					queue.offer(new Integer[] { newx, newy });
				}
			}
		}
		return visit[M][N];
	}
}
