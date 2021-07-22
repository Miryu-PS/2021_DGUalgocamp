import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int Answer = -1;
		for (int i = 0; i * 3 <= N; i++) { // 3병짜리 상자를 i개 고르고
			for (int j = 0; j * 5 <= N; j++) { // 5병짜리 상자를 j개 고른다.
				int Total = i * 3 + j * 5; // 총 콜라의 병 수 = Total
				if (Total == N) { // 만약 3병짜리 상자를 i개 고르고, 5병짜리 상자를 j개 고르는 것이 답의 후보가 된다면
					int Box = i + j; // 총 상자수는 i+j
					if (Answer == -1 || Answer > Box) { // 지금까지 구한 최소 상자수 Answer보다 Box가 작다면(또는 Answer이 아직 갱신되지 않았다면)
						Answer = Box;
					}
				}
			}
		}
		if (Answer != 0) {
			System.out.println(Answer);
		}

		else {
			System.out.println(-1);
		}
	}
}
