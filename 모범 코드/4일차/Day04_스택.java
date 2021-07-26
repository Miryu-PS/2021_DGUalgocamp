import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<Integer>();
		// stack�� �̷��� �����մϴ�.
		// ������ ���������� ���� �����մϴ� int(X) char(X) Integer(O) Character(O)
		// Stack<object> stack_name = new Stack<object>();

		while (true) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if (str.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				stack.push(x); // stack�� x�� �׽��ϴ�.
				sb.append(x + "\n");
			}
			if (str.equals("pop")) {
				if (stack.empty()) { // ���� ���ǿ� ���� ������ ����ִٸ� -1�� ����մϴ�.
					sb.append("-1\n");
					continue;
				}
				int x = stack.pop(); // ������ �� ���� ���� ���� x�� �����ϰ� ���ÿ��� �����մϴ�.

				/*
				 * �Ǵ� ������ ���� �� ���� �ֽ��ϴ�. 
				 * int x = stack.peek(); // ������ �� ���� ���� ���� x�� �����մϴ�.
				 * stack.pop(); // ������ �� ���� ���� ���� �����մϴ�.
				 */
				sb.append(x + "\n");
			}
			if (str.equals("size")) {
				int x = stack.size(); // ���ÿ� �׿��ִ� ������ ������ x�� �����մϴ�.
				sb.append(x + "\n");
			}
			if (str.equals("empty")) {
				Boolean isEmpty = stack.empty(); // isEmpty�� ������ ����ִ��� ���θ� �����մϴ�.
				if (isEmpty)
					sb.append("1\n");
				else
					sb.append("0\n");
			}
			if (str.equals("top")) {
				if (stack.empty()) { // ���� ���ǿ� ���� ������ ����ִٸ� -1�� ����մϴ�.
					sb.append("-1\n");
					continue;
				}
				int x = stack.peek(); // ������ �� ���� ���� ���� x�� �����մϴ�.
				sb.append(x + "\n");
			}
			if (str.equals("end")) {
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
