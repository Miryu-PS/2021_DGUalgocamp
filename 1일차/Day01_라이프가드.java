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

		for (int i = 0; i < N; i++) // i�� ����� �ذ����� �� ������ �ð��� ���
		{
			// i�� ������ �ذ��ϸ� i�� ������ �ٹ��ð����� ������������ ���� 1 �پ���.
			for (int j = brr[i][0]; j < brr[i][1]; j++)
				arr[j]--;

			int safetime = 0; // ������ �ð��� count ������.
			for (int j = 0; j < MAXN; j++) {
				if (arr[j] != 0) // ���ϰ� �ִ� ������������ ���� 0�� �ƴ϶�� �� �ð���� ������ �ð��̴�.
					safetime++;
			}

			// ������ �ð��� �ִ밪�� ���Ѵ�.
			if (answer < safetime)
				answer = safetime;

			// arr �迭�� �ٽ� �������
			for (int j = brr[i][0]; j < brr[i][1]; j++)
				arr[j]++;
		}

		System.out.println(answer);
	}
}