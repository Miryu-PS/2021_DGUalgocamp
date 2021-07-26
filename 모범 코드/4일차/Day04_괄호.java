import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Str = br.readLine();
		char[] str = Str.toCharArray();
		Stack<Character> stack = new Stack<Character>(); // ������ ��Ī��ų �� �ִ� ���� ��ȣ�� ��� �ִ�.
		Boolean pos = true;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == '(') { // ���� ��ȣ�� ���ÿ� push�Ѵ�.
				stack.push('(');
			} 
			else { // �ݴ� ��ȣ�� ��Ī��ų �� �ִ� ���� ��ȣ�� �ִٸ�, ��Ī��Ų��.
				if (stack.empty()) { // ���� ��Ī��ų �� �ִ� ���� ��ȣ�� ���ٸ�, �������� ��ȣ���ڿ��� �� �� ����.
					pos = false;
					break;
				} 
				else
					stack.pop(); // ��Ī�� �Ϸ�� ���� ��ȣ�� stack���� �����Ѵ�.
			}
		}
		
		if (pos == true && stack.empty()) {
			System.out.println(":)");
		} 
		else {
			System.out.println(":(");
		}
	}
}