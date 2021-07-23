import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String Board = br.readLine();
		char[] board = Board.toCharArray();
		int ans = 0;
		for (int i = 0; i < N; i++) {
			String Str = br.readLine();
			char[] str = Str.toCharArray();
			boolean pos = false;
			for (int j = 0; j < str.length; j++) { // str���� j�� ���������� �ϰ�
				for (int d = 1; d < str.length; d++) { // dĭ�� �ǳʶٸ鼭 ���� board.length �� ���ڿ��� �����.
					// str[j], str[j+d], str[j+2*d], ......, str[j+(board.length - 1)*d] ��
					// board.length���� ���ڸ� �˻��ϸ� �˴ϴ�.
					if (j + (board.length - 1) * d >= str.length) // str���� ���ǿ� �°� ���ڵ��� �� �� ���ٸ� �н�
						continue;
					boolean same = true; // str���� �� board.length ���� ���ڵ��� board�� ���� ��ġ�ϴ� �� üũ
					for (int k = 0; k < board.length; k++) {
						if (board[k] != str[j + k * d]) // ���� �ٸ� ���ڸ� ã���� same�� false��
							same = false;
					}
					if (same == true) { // ��� ���ڵ��� ���� ���ٸ�, �� ���ڿ������� ������ ���� �� �ִ�.
						pos = true;
					}
				}
			}
			if (pos == true) { // ������ ���� �� �ִٸ� �信 ++
				ans++;
			}
		}
		System.out.println(ans);
	}

}
