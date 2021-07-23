import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] arr = new int[505];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		int ans = 0;
		for (int i = 0; i < N; i++) { // ������ ������ i
			for (int j = i; j < N; j++) { // ������ ���� j
				int sum = 0;
				for (int k = i; k <= j; k++) { // sum�� ������ ���ҵ��� ���� ����
					sum += arr[k];
				}
				if (sum == M) {
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

}
