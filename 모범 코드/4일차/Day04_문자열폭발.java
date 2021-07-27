import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {
	public static char[] stack; // ������ �迭�� ����

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
			stack[stp++] = str[i]; // stack�� str[i]�� push
			if (stp >= bomb.length) { // stack�� bomb�� ���� �̻��� ���ڰ� ������ �˻�
				boolean chk = true; // stack�� �ֱ� bomb.length���� ���ڿ�, bomb�� ��ġ�ϴ��� �˻�
				for (int j = 0; j < bomb.length; j++) {
					if (stack[stp - bomb.length + j] != bomb[j]) { // �ٸ� ���ڰ� �ִٸ� chk=false;
						chk = false;
						break;
					}
				}
				if (chk == true) { // stack�� �ֱ� bomb.length���� ���ڿ�, bomb�� ��ġ�Ѵٸ�, ���ڿ��� ���߽�Ų��. (���ÿ��� ��ġ�ϴ� ���ڵ��� pop�Ѵ�)
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
