import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int arr[][];
	static int firedist[][];
	static int dist[][];
	static int R, C;
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			C = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			arr = new int[R + 1][C + 1];
			dist = new int[R + 1][C + 1];
			firedist = new int[R + 1][C + 1];
			int sx = 0, sy = 0;
			Queue<Integer[]> queue = new LinkedList<>();

			for (int i = 1; i <= R; i++) {
				String str = br.readLine();
				for (int j = 1; j <= C; j++) {
					char tmp = str.charAt(j - 1);
					if (tmp == '.')
						arr[i][j] = 1;
					if (tmp == '@') { // 시작 위치는 sx, sy에 저장 
						sx = i;
						sy = j;
						arr[i][j] = 1;
					}
					if (tmp == '*') { // 불의 위치는 전부 큐에 넣는다.
						queue.offer(new Integer[] { i, j });
						firedist[i][j] = 1;
						arr[i][j] = 1;
					}
				}
			}

			while (!queue.isEmpty()) { // 빈칸에서 가장 가까운 불까지의 거리를 firedist에 저장, 즉 해당 빈칸은 firedist에 저장된 값만큼 시간이 지나면 불이 붙음
				Integer[] tmp = queue.poll();
				int x = tmp[0], y = tmp[1];
				for (int i = 0; i < 4; i++) {
					int newx = x + dx[i], newy = y + dy[i];
					if (newx < 1 || newx > R || newy < 1 || newy > C)
						continue;
					if (arr[newx][newy] == 1 && firedist[newx][newy] == 0) {
						firedist[newx][newy] = firedist[x][y] + 1;
						queue.offer(new Integer[] { newx, newy });
					}
				}
			}

			queue = new LinkedList<>();
			queue.offer(new Integer[] { sx, sy });
			dist[sx][sy] = 1;
			int ans = Integer.MAX_VALUE;
			
			while (!queue.isEmpty()) { // sx,sy부터 bfs
				Integer[] tmp = queue.poll();
				int x = tmp[0], y = tmp[1];
				for (int i = 0; i < 4; i++) {
					int newx = x + dx[i], newy = y + dy[i];
					if (newx < 1 || newx > R || newy < 1 || newy > C) { // (newx, newy)가 외부지점이라면 탈출할 수 있다.
						ans = Math.min(ans, dist[x][y] + 1);
						continue;
					}
					if (arr[newx][newy] == 1 && dist[newx][newy] == 0 // 방문한 적 없는 빈칸이고
							&& (firedist[newx][newy] == 0 || firedist[newx][newy] > dist[x][y] + 1)) { // 불이 아직 옮겨붙지 않았다면 
						dist[newx][newy] = dist[x][y] + 1;
						queue.offer(new Integer[] { newx, newy });
					}
				}
			}

			if (ans == Integer.MAX_VALUE)
				sb.append("IMPOSSIBLE\n");
			else
				sb.append((ans - 1) + "\n");
		}
		System.out.println(sb.toString());
	}

}
