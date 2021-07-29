import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> hmap = new HashMap<>();
		int N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int key = Integer.parseInt(st.nextToken());
			if (hmap.containsKey(key)) {
				hmap.replace(key, hmap.get(key) + 1);
			} else {
				hmap.put(key, 1);
			}
		}

		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			key = Integer.parseInt(st.nextToken());

			if (hmap.containsKey(key)) {
				sb.append(hmap.get(key) + " ");
			} else {
				sb.append(0 + " ");
			}
		}

		System.out.println(sb.toString());
	}
}