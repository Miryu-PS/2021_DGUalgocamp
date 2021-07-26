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
		for (int i = 0; i < N; i++) { // 정사각형 구간의 시작 좌표 (i,j)
			for (int j = 0; j < M; j++) { //
				for (int d = 0; i + d < N && j + d < M; d++) { // (i,j)가 왼쪽 위이고, (i+d, j+d)가 오른쪽 아래인, 크기 (d+1)*(d+1)인 정사각형 탐색
					if (arr[i][j] == arr[i + d][j] && arr[i][j] == arr[i + d][j + d] && arr[i][j] == arr[i][j + d]) { // 꼭짓점의 값이 모두 같다면
						ans = Math.max(ans, (d + 1) * (d + 1)); // 답에 (d+1)*(d+1) = 정사각형의 크기 갱신
					}
				}
			}
		}
		System.out.println(ans);
	}
}