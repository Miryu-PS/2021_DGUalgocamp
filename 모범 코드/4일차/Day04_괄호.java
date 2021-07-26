import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Str = br.readLine();
		char[] str = Str.toCharArray();
		Stack<Character> stack = new Stack<Character>(); // 스택은 매칭시킬 수 있는 여는 괄호를 담고 있다.
		Boolean pos = true;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == '(') { // 여는 괄호는 스택에 push한다.
				stack.push('(');
			} 
			else { // 닫는 괄호는 매칭시킬 수 있는 여는 괄호가 있다면, 매칭시킨다.
				if (stack.empty()) { // 만약 매칭시킬 수 있는 여는 괄호가 없다면, 정상적인 괄호문자열이 될 수 없다.
					pos = false;
					break;
				} 
				else
					stack.pop(); // 매칭이 완료된 여는 괄호는 stack에서 제거한다.
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