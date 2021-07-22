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
		for (int i = 1; i < MAXN; i++) // answer에 한 명을 해고하기 전의 안전한 시간을 저장
		{
			if (arr[i] != 0)
				answer++;
		}

		int mini = 1000; // 줄어드는 안전한 시간의 최소값
		for (int i = 0; i < N; i++) // 해고하였을 때 안전한 시간이 가장 적게 줄어드는 사람을 골라 해고
		{
			int tmp = 0; // i번 직원을 해고하였을 때 줄어드는 안전한 시간
			for (int j = brr[i][0]; j < brr[i][1]; j++) // i번 직원이 일하는 시간대에
			{
				if (arr[j] == 1)
					tmp++; // 만약 혼자 일하고 있었다면, i번 직원이 해고되면 안전한 시간이 줄어든다.
			}
			if (tmp < mini)
				mini = tmp;
		}

		System.out.println(answer - mini);
	}
}