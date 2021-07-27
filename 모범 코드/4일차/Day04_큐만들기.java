import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			char query = st.nextToken().charAt(0);
			if (query == 'a') { // a라면 stack1에 push
				int item = Integer.parseInt(st.nextToken());
				stack1.push(item);
			} else if (query == 'b') {
				if (stack2.empty()) { // b이고 stack2가 비어있다면 stack1에서 pop해서 stack2에 push
					while (!stack1.empty()) {
						int x = stack1.pop();
						stack2.push(x);
						sb.append(x + " ");
					}
					sb.append("\n");
				} else { // stack 2가
					stack2.pop();
				}
			}
		}
		System.out.println(sb.toString());
	}
}