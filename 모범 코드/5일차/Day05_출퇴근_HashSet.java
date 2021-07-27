import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			String io = st.nextToken();
			if (io.equals("enter")) {
				set.add(str);
			} else {
				set.remove(str);
			}
		}

		ArrayList<String> arr = new ArrayList<String>(set); // hset의 key들을 ArrayList arr로 저장
		Collections.sort(arr); // 정렬
		sb.append(arr.size() + "\n");

		for (String str : arr) {
			sb.append(str + "\n");
		}
		System.out.println(sb.toString());
	}

}
