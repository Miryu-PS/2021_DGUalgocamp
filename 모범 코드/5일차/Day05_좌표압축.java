import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[N];
		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			arrList.add(arr[i]);
		}
		Collections.sort(arrList);

		HashMap<Integer, Integer> hmap = new HashMap<>();
		int t = 0;
		for (int i = 0; i < N; i++) {
			if (!hmap.containsKey(arrList.get(i))) {
				hmap.put(arrList.get(i), t++);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(hmap.get(arr[i]) + " ");
		}
		System.out.println(sb.toString());
	}
}
