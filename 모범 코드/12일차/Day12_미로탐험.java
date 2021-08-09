import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int arr[][];
	static int dist[][];
	static int N, M, cnt;
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][M + 1];
		dist = new int[N + 1][M + 1];

		for (int i = 1; i <= N; i++) {
			String str = br.readLine();
			for (int j = 1; j <= M; j++) {
				arr[i][j] = (int) (str.charAt(j - 1) - '0');
			}
		}

		Queue<Integer[]> queue = new LinkedList<>();
		queue.offer(new Integer[] { 1, 1 });
		dist[1][1] = 1;

		while (!queue.isEmpty()) {
			Integer[] tmp = queue.poll();
			int x = tmp[0], y = tmp[1];
			for (int i = 0; i < 4; i++) {
				int newx = x + dx[i], newy = y + dy[i]; // (x,y)와 인접한 점 (newx, newy)
				if (newx < 1 || newx > N || newy < 1 || newy > M) // OOB 체크
					continue;
				if (arr[newx][newy] == 1 && dist[newx][newy] == 0) { // (newx, newy)가 queue에 들어간 적 없는 '1'인 좌표라면
					dist[newx][newy] = dist[x][y] + 1; // (newx, newy)까지의 거리는 (x,y)까지의 거리 + 1
					queue.offer(new Integer[] { newx, newy }); // queue에 (newx, newy) offer
				}
			}
		}
		
		if (dist[N][M] == 0)
			System.out.println(-1);
		else
			System.out.println(dist[N][M]);
	}

}
