import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<Integer>();
		int K = Integer.parseInt(br.readLine());
		int ans = 0;
		while (K-- > 0) {
			int x = Integer.parseInt(br.readLine()); // 입력 받은 수 x
			if (x != 0) { // x가 0이 아니라면, stack에 x를 넣고, 답에 x를 더한다.
				stack.push(x);
				ans += x;
			} 
			else { // 0이 입력으로 들어오면, stack에서 수를 빼내고, 빼낸 수만큼 답에서 빼준다
				int y = stack.pop();
				ans -= y;
			}
		}
		System.out.println(ans);
	}
}
