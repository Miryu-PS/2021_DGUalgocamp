import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 1; i <= N; i++) { // 큐에 1~N의 수를 차례로 넣는다.
			queue.offer(i);
		}
		while (!queue.isEmpty()) { // 큐가 빌 때까지 반복한다.
			for (int i = 1; i < M; i++) { // M-1개는 맨 뒤로 보내고
				int x = queue.poll();
				queue.offer(x);
			}
			int x = queue.poll(); // M번째는 빼내서 출력한다.
			sb.append(x + " ");
		}
		System.out.println(sb.toString());
	}
}
