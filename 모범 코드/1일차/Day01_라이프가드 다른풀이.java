import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int MAXN = 100100;
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[MAXN]; // arr[i] = i�д뿡 ���ϰ� �ִ� ������������ ��
		int[][] brr = new int[MAXN][2];
		int answer = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			brr[i][0] = Integer.parseInt(st.nextToken());
			brr[i][1] = Integer.parseInt(st.nextToken());
			for (int j = brr[i][0]; j < brr[i][1]; j++) { // i�� ����������� brr[i][0]�к��� brr[i][1]�� ������ ���ߴ�.
				arr[j]++;
			}
		}
		for (int i = 1; i < MAXN; i++) // answer�� �� ���� �ذ��ϱ� ���� ������ �ð��� ����
		{
			if (arr[i] != 0)
				answer++;
		}

		int mini = 1000; // �پ��� ������ �ð��� �ּҰ�
		for (int i = 0; i < N; i++) // �ذ��Ͽ��� �� ������ �ð��� ���� ���� �پ��� ����� ��� �ذ�
		{
			int tmp = 0; // i�� ������ �ذ��Ͽ��� �� �پ��� ������ �ð�
			for (int j = brr[i][0]; j < brr[i][1]; j++) // i�� ������ ���ϴ� �ð��뿡
			{
				if (arr[j] == 1)
					tmp++; // ���� ȥ�� ���ϰ� �־��ٸ�, i�� ������ �ذ�Ǹ� ������ �ð��� �پ���.
			}
			if (tmp < mini)
				mini = tmp;
		}

		System.out.println(answer - mini);
	}
}