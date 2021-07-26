import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		Queue<Integer> queue = new LinkedList<>();
		// Queue는 LinkedList로 구현되어있습니다.
		// 참조형 변수로만 선언 가능합니다.
		// Queue<Object> queue_name = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());
		int back = 0;
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			if (str.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				queue.offer(x); // queue에 x를 넣습니다.
				back = x;
			}

			if (str.equals("pop")) {
				if (queue.isEmpty()) { // 문제 조건에 따라 큐가 비어있다면 -1을 출력합니다.
					sb.append("-1\n");
					continue;
				}
				int x = queue.poll(); // 큐에 가장 먼저 들어간 값을 x에 저장하고, 큐에서 제거합니다.
				/*
				 * 또는 다음과 같이 쓸 수도 있습니다 
				 * int x = queue.peek(); // 큐에 가장 먼저 들어간 값을 x에 저장합니다.
				 * queue.remove(); // 큐에 가장 먼저 들어간 값을 큐에서 제거합니다. queue.pop(); 를 사용해도 됩니다.
				 */
				sb.append(x + "\n");
			}

			if (str.equals("size")) {
				int x = queue.size(); // queue에 들어있는 원소의 개수를 x에 저장합니다.
				sb.append(x + "\n");
			}

			if (str.equals("empty")) {
				Boolean isEmpty = queue.isEmpty(); // isEmpty에 큐가 비어있는지 여부를 저장합니다.
				if (isEmpty)
					sb.append("1\n");
				else
					sb.append("0\n");
			}

			if (str.equals("front")) {
				if (queue.isEmpty()) { // 문제 조건에 따라 큐가 비어있다면 -1을 출력합니다.
					sb.append("-1\n");
					continue;
				}
				int x = queue.peek(); // 큐에 가장 먼저 들어간 값을 x에 저장합니다.
				sb.append(x + "\n");
			}

			if (str.equals("back")) {
				if (queue.isEmpty()) {
					sb.append("-1\n");
					continue;
				}
				int x = back;
				sb.append(x + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
