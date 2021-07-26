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
		// stack은 이렇게 선언합니다.
		// 참조형 변수만으로 선언 가능합니다 int(X) char(X) Integer(O) Character(O)
		// Stack<object> stack_name = new Stack<object>();

		while (true) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			if (str.equals("push")) {
				int x = Integer.parseInt(st.nextToken());
				stack.push(x); // stack에 x를 쌓습니다.
				sb.append(x + "\n");
			}
			if (str.equals("pop")) {
				if (stack.empty()) { // 문제 조건에 따라 스택이 비어있다면 -1을 출력합니다.
					sb.append("-1\n");
					continue;
				}
				int x = stack.pop(); // 스택의 맨 위에 쌓인 값을 x에 저장하고 스택에서 제거합니다.

				/*
				 * 또는 다음과 같이 쓸 수도 있습니다. 
				 * int x = stack.peek(); // 스택의 맨 위에 쌓인 값을 x에 저장합니다.
				 * stack.pop(); // 스택의 맨 위에 쌓인 값을 제거합니다.
				 */
				sb.append(x + "\n");
			}
			if (str.equals("size")) {
				int x = stack.size(); // 스택에 쌓여있는 원소의 개수를 x에 저장합니다.
				sb.append(x + "\n");
			}
			if (str.equals("empty")) {
				Boolean isEmpty = stack.empty(); // isEmpty에 스택이 비어있는지 여부를 저장합니다.
				if (isEmpty)
					sb.append("1\n");
				else
					sb.append("0\n");
			}
			if (str.equals("top")) {
				if (stack.empty()) { // 문제 조건에 따라 스택이 비어있다면 -1을 출력합니다.
					sb.append("-1\n");
					continue;
				}
				int x = stack.peek(); // 스택의 맨 위에 쌓인 값을 x에 저장합니다.
				sb.append(x + "\n");
			}
			if (str.equals("end")) {
				break;
			}
		}
		System.out.println(sb.toString());
	}
}
