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
			for (int j = 0; j < str.length; j++) { // str에서 j를 시작점으로 하고
				for (int d = 1; d < str.length; d++) { // d칸씩 건너뛰면서 길이 board.length 의 문자열을 골라보자.
					// str[j], str[j+d], str[j+2*d], ......, str[j+(board.length - 1)*d] 의
					// board.length개의 문자를 검사하면 됩니다.
					if (j + (board.length - 1) * d >= str.length) // str에서 조건에 맞게 문자들을 고를 수 없다면 패스
						continue;
					boolean same = true; // str에서 고른 board.length 개의 문자들이 board와 전부 일치하는 지 체크
					for (int k = 0; k < board.length; k++) {
						if (board[k] != str[j + k * d]) // 만약 다른 문자를 찾으면 same을 false로
							same = false;
					}
					if (same == true) { // 모든 문자들이 전부 같다면, 이 문자열에서는 간판을 만들 수 있다.
						pos = true;
					}
				}
			}
			if (pos == true) { // 간판을 만들 수 있다면 답에 ++
				ans++;
			}
		}
		System.out.println(ans);
	}

}
