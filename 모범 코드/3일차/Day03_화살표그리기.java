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

		for (int i = 0; i < N; i++) { // i에서 이어지는 화살표의 길이를 구한다.
			int minDist = Integer.MAX_VALUE;
			for (int j = 0; j < N; j++) { // 모든 점 j를 탐색
				if (i == j) // 같은 점은 넘어가고
					continue;
				if (arr[i][1] == arr[j][1]) { // 색이 같은 점들 중, 거리가 가장 짧은 점을 구해 그 거리를 저장한다.
					int dist = Math.abs(arr[i][0] - arr[j][0]);
					minDist = Math.min(dist, minDist);
				}
			}
			ans += minDist; // 답에 i에서 이어지는 화살표의 길이를 더한다.
		}

		System.out.println(ans);

	}

}
