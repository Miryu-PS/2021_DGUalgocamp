import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int MAXN = 100100;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[MAXN]; // arr[i] = i분대에 일하고 있는 라이프가드의 수
		int[][] brr = new int[MAXN][2];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			brr[i][0] = Integer.parseInt(st.nextToken());
			brr[i][1] = Integer.parseInt(st.nextToken());
			for (int j = brr[i][0]; j < brr[i][1]; j++) { // i번 라이프가드는 brr[i][0]분부터 brr[i][1]분 전까지 일했다.
				arr[j]++;
			}
		}

		for (int i = 0; i < N; i++) // i번 사람을 해고했을 때 안전한 시간을 계산
		{
			// i번 직원을 해고하면 i번 직원의 근무시간에는 라이프가드의 수가 1 줄어든다.
			for (int j = brr[i][0]; j < brr[i][1]; j++)
				arr[j]--;

			int safetime = 0; // 안전한 시간을 count 해주자.
			for (int j = 0; j < MAXN; j++) {
				if (arr[j] != 0) // 일하고 있는 라이프가드의 수가 0이 아니라면 이 시간대는 안전한 시간이다.
					safetime++;
			}

			// 안전한 시간의 최대값을 구한다.
			if (answer < safetime)
				answer = safetime;

			// arr 배열을 다시 원래대로
			for (int j = brr[i][0]; j < brr[i][1]; j++)
				arr[j]++;
		}

		System.out.println(answer);
	}
}