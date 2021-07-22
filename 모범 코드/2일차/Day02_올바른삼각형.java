import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[105][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int Maxarea = 0;
		for (int i = 0; i < N; i++) { // �߽��� i
			for (int j = 0; j < N; j++) { // i�� x��ǥ�� ���� j
				for (int k = 0; k < N; k++) { // i�� y��ǥ�� ���� k
					if (i == j || j == k || k == i) // ���� �ߺ��ؼ� ����� ���
						continue;
					if (arr[i][0] == arr[j][0] && arr[i][1] == arr[k][1]) {
						int width = arr[i][0] - arr[k][0];
						int height = arr[i][1] - arr[j][1];
						if (width < 0)
							width = -width;
						if (height < 0)
							height = -height;
						int area = width * height;
						if (Maxarea < area)
							Maxarea = area;
					}
				}
			}
		}
		System.out.println(Maxarea);
	}

}
