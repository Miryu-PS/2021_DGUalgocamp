import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day01_9_407 {
	public static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		arr = new int[105];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		printarr(sb, N);

		for (int i = 1; i < N; i++) {
			int target = arr[i];
			int j = i;
			while (j >= 1 && target < arr[j - 1]) {
				arr[j] = arr[j - 1];
				arr[j - 1] = target;
				j--;
				printarr(sb, N);
			}
			arr[j] = target;
		}

		System.out.println(sb.toString());
	}

	private static void printarr(StringBuilder sb, int N) {
		for (int i = 0; i < N; i++) {
			sb.append(arr[i] + " ");
		}
		sb.append("\n");
	}
}
