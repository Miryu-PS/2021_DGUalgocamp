import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day01_6_2941 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				for (int k = j; k <= N; k++) {
					if (i + j + k == N && k < i + j)
						count++;
				}
			}
		}

		System.out.println(count);
	}

	public static void main_(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int count = 0;
		for (int i = 1; i <= N; i++) {
			for (int j = i; j <= N; j++) {
				int k = N - i - j;
				if (j <= k && k < i + j)
					count++;
			}
		}

		System.out.println(count);
	}
}
