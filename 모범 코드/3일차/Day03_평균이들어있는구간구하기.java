import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int ans = 0;

		for (int i = 0; i < N; i++) { // ������ ������ i
			for (int j = i; j < N; j++) { // ������ ���� j
				int sum = 0;
				for (int k = i; k <= j; k++) // sum�� ������ ���� ����
					sum += arr[k];
				if (sum % (j - i + 1) != 0) // ���� ����� ������ ������ �ʴ´ٸ� �˻����� �ʴ´�.
					continue;
				int mean = sum / (j - i + 1); // ��� = ������ �� / ������ ����
				boolean check = false;
				for (int k = i; k <= j; k++) { // �ݺ����� ������ ����� �ִ��� ã�´�.
					if (mean == arr[k]) {
						check = true;
						break;
					}
				}
				if (check == true) { // ����� �ִٸ� �信 ++
					ans++;
				}
			}
		}

		System.out.println(ans);

	}

}
