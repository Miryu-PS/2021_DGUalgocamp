import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day01_3_2123 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[105];
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int Answer = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) { // j는 i+1부터 탐색
				for (int k = j + 1; k <= N; k++) { // k는 j+1부터 탐색
					int Total = arr[i] + arr[j] + arr[k]; // 총 카드의 합은 Total
					if (Total <= M && Total > Answer) { // Total이 M 이하이고, 지금까지 구한 최대값보다 크다면
						Answer = Total; // Answer를 Total로 갱신
					}
				}
			}
		}
		System.out.println(Answer);
	}
}
