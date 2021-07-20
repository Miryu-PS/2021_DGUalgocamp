import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day01_2_556 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int Answer = 0;
		for (int i = 0; i <= (N / A); i++) { // A인실의 개수 i
			for (int j = 0; j <= (N / B); j++) { // B인실의 개수 j
				for (int k = 0; k <= (N / C); k++) { // C인실의 개수 k
					int Total = i * A + j * B + k * C; // 총 인원의 수는 Total
					if (Total == N) { // 문제의 조건을 만족한다면
						Answer = 1;
					}
				}
			}
		}
		System.out.println(Answer);
	}
}
