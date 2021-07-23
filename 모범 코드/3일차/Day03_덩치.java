import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[55][2];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			int bigger = 0; // i보다 덩치가 큰 사람을 세어준다.
			for (int j = 0; j < N; j++) {
				if (i == j)
					continue; // 자기 자신은 제외
				if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) { // j가 i보다 키와 몸무게 둘 다 크다면
					bigger++;
				}
			}
			sb.append((bigger + 1) + " "); // 자신보다 덩치가 큰 사람의 수 + 1 을 출력
		}
		System.out.println(sb.toString());
	}

}
