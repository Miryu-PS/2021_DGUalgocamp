import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int idx = 0;

		for (int i = 1; i <= N; i++) { // 1부터 N까지의 수를 스택에 넣으면서 
			stack.push(i);
			sb.append("+\n");
			while (!stack.empty() && stack.peek() == arr[idx]) { // 스택의 top에 있는 숫자가, arr에서 꺼내야 하는 수와 일치하면 pop하여 출력한다.
				sb.append("-\n");
				idx++;
				stack.pop();
			}
		}
		if (stack.empty()) {
			System.out.println(sb);
		} else {
			System.out.println("NO");
		}
	}
}