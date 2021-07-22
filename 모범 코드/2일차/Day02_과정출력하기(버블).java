import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[105];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int k = 0; k < N; k++) {
			sb.append(arr[k] + " ");
		}
		sb.append("\n");
		for (int i = 0; i < N - 1; i++) {
			for (int j = 1; j < N - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
					for (int k = 0; k < N; k++) {
						sb.append(arr[k] + " ");
					}
					sb.append("\n");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
