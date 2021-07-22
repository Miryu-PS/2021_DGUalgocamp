import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int Answer = -1;
		for (int i = 0; i * 3 <= N; i++) { // 3��¥�� ���ڸ� i�� ����
			for (int j = 0; j * 5 <= N; j++) { // 5��¥�� ���ڸ� j�� ����.
				int Total = i * 3 + j * 5; // �� �ݶ��� �� �� = Total
				if (Total == N) { // ���� 3��¥�� ���ڸ� i�� ����, 5��¥�� ���ڸ� j�� ���� ���� ���� �ĺ��� �ȴٸ�
					int Box = i + j; // �� ���ڼ��� i+j
					if (Answer == -1 || Answer > Box) { // ���ݱ��� ���� �ּ� ���ڼ� Answer���� Box�� �۴ٸ�(�Ǵ� Answer�� ���� ���ŵ��� �ʾҴٸ�)
						Answer = Box;
					}
				}
			}
		}
		if (Answer != 0) {
			System.out.println(Answer);
		}

		else {
			System.out.println(-1);
		}
	}
}
