import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class main {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		char arr[][] = new char[N][M];
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++)
				arr[i][j] = str.charAt(j);
		}
		int ans = 0;
		for (int i = 0; i < N; i++) { // ���簢�� ������ ���� ��ǥ (i,j)
			for (int j = 0; j < M; j++) { //
				for (int d = 0; i + d < N && j + d < M; d++) { // (i,j)�� ���� ���̰�, (i+d, j+d)�� ������ �Ʒ���, ũ�� (d+1)*(d+1)�� ���簢�� Ž��
					if (arr[i][j] == arr[i + d][j] && arr[i][j] == arr[i + d][j + d] && arr[i][j] == arr[i][j + d]) { // �������� ���� ��� ���ٸ�
						ans = Math.max(ans, (d + 1) * (d + 1)); // �信 (d+1)*(d+1) = ���簢���� ũ�� ����
					}
				}
			}
		}
		System.out.println(ans);
	}
}