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
		int arr[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int ans = 0;

		for (int i = 0; i < N; i++) { // i���� �̾����� ȭ��ǥ�� ���̸� ���Ѵ�.
			int minDist = Integer.MAX_VALUE;
			for (int j = 0; j < N; j++) { // ��� �� j�� Ž��
				if (i == j) // ���� ���� �Ѿ��
					continue;
				if (arr[i][1] == arr[j][1]) { // ���� ���� ���� ��, �Ÿ��� ���� ª�� ���� ���� �� �Ÿ��� �����Ѵ�.
					int dist = Math.abs(arr[i][0] - arr[j][0]);
					minDist = Math.min(dist, minDist);
				}
			}
			ans += minDist; // �信 i���� �̾����� ȭ��ǥ�� ���̸� ���Ѵ�.
		}

		System.out.println(ans);

	}

}
