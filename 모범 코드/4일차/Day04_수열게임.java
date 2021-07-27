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

		for (int i = 1; i <= N; i++) { // 1���� N������ ���� ���ÿ� �����鼭 
			stack.push(i);
			sb.append("+\n");
			while (!stack.empty() && stack.peek() == arr[idx]) { // ������ top�� �ִ� ���ڰ�, arr���� ������ �ϴ� ���� ��ġ�ϸ� pop�Ͽ� ����Ѵ�.
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