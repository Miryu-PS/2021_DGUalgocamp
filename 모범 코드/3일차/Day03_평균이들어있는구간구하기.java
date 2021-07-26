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

		for (int i = 0; i < N; i++) { // 구간의 시작점 i
			for (int j = i; j < N; j++) { // 구간의 끝점 j
				int sum = 0;
				for (int k = i; k <= j; k++) // sum에 구간의 합을 저장
					sum += arr[k];
				if (sum % (j - i + 1) != 0) // 만약 평균이 정수로 나오지 않는다면 검사하지 않는다.
					continue;
				int mean = sum / (j - i + 1); // 평균 = 구간의 합 / 구간의 길이
				boolean check = false;
				for (int k = i; k <= j; k++) { // 반복문을 돌리며 평균이 있는지 찾는다.
					if (mean == arr[k]) {
						check = true;
						break;
					}
				}
				if (check == true) { // 평균이 있다면 답에 ++
					ans++;
				}
			}
		}

		System.out.println(ans);

	}

}
