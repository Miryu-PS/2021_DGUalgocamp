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
			for (int j = i + 1; j <= N; j++) { // j�� i+1���� Ž��
				for (int k = j + 1; k <= N; k++) { // k�� j+1���� Ž��
					int Total = arr[i] + arr[j] + arr[k]; // �� ī���� ���� Total
					if (Total <= M && Total > Answer) { // Total�� M �����̰�, ���ݱ��� ���� �ִ밪���� ũ�ٸ�
						Answer = Total; // Answer�� Total�� ����
					}
				}
			}
		}
		System.out.println(Answer);
	}
}
