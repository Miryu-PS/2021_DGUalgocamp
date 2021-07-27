import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {
	public static char[] stack; // 스택을 배열로 구현

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		stack = new char[1000005];
		int stp = 0;
		String Str = br.readLine();
		String Bomb = br.readLine();
		char[] str = Str.toCharArray();
		char[] bomb = Bomb.toCharArray();
		for (int i = 0; i < str.length; i++) {
			stack[stp++] = str[i]; // stack에 str[i]를 push
			if (stp >= bomb.length) { // stack에 bomb의 길이 이상의 문자가 있으면 검사
				boolean chk = true; // stack의 최근 bomb.length개의 문자와, bomb이 일치하는지 검사
				for (int j = 0; j < bomb.length; j++) {
					if (stack[stp - bomb.length + j] != bomb[j]) { // 다른 문자가 있다면 chk=false;
						chk = false;
						break;
					}
				}
				if (chk == true) { // stack의 최근 bomb.length개의 문자와, bomb이 일치한다면, 문자열을 폭발시킨다. (스택에서 일치하는 문자들을 pop한다)
					stp -= bomb.length;
				}
			}
		}
		for (int i = 0; i < stp; i++) {
			sb.append(stack[i]);
		}
		if (stp == 0) {
			System.out.println("FRULA");
		} else {
			System.out.println(sb.toString());
		}
	}
}
