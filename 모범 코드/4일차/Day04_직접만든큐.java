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
		// Queue�� LinkedList�� �����Ǿ��ֽ��ϴ�.
		// ������ �����θ� ���� �����մϴ�.
		// Queue<Object> queue_name = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());
		int back = 0;
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			if (str.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				queue.offer(x); // queue�� x�� �ֽ��ϴ�.
				back = x;
			}

			if (str.equals("pop")) {
				if (queue.isEmpty()) { // ���� ���ǿ� ���� ť�� ����ִٸ� -1�� ����մϴ�.
					sb.append("-1\n");
					continue;
				}
				int x = queue.poll(); // ť�� ���� ���� �� ���� x�� �����ϰ�, ť���� �����մϴ�.
				/*
				 * �Ǵ� ������ ���� �� ���� �ֽ��ϴ� 
				 * int x = queue.peek(); // ť�� ���� ���� �� ���� x�� �����մϴ�.
				 * queue.remove(); // ť�� ���� ���� �� ���� ť���� �����մϴ�. queue.pop(); �� ����ص� �˴ϴ�.
				 */
				sb.append(x + "\n");
			}

			if (str.equals("size")) {
				int x = queue.size(); // queue�� ����ִ� ������ ������ x�� �����մϴ�.
				sb.append(x + "\n");
			}

			if (str.equals("empty")) {
				Boolean isEmpty = queue.isEmpty(); // isEmpty�� ť�� ����ִ��� ���θ� �����մϴ�.
				if (isEmpty)
					sb.append("1\n");
				else
					sb.append("0\n");
			}

			if (str.equals("front")) {
				if (queue.isEmpty()) { // ���� ���ǿ� ���� ť�� ����ִٸ� -1�� ����մϴ�.
					sb.append("-1\n");
					continue;
				}
				int x = queue.peek(); // ť�� ���� ���� �� ���� x�� �����մϴ�.
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
