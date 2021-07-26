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
			int x = Integer.parseInt(br.readLine()); // �Է� ���� �� x
			if (x != 0) { // x�� 0�� �ƴ϶��, stack�� x�� �ְ�, �信 x�� ���Ѵ�.
				stack.push(x);
				ans += x;
			} 
			else { // 0�� �Է����� ������, stack���� ���� ������, ���� ����ŭ �信�� ���ش�
				int y = stack.pop();
				ans -= y;
			}
		}
		System.out.println(ans);
	}
}
