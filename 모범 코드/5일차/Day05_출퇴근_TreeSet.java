import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.Iterator;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			String io = st.nextToken();
			if (io.equals("enter")) {
				set.add(str);
			}
			else {
				set.remove(str);
			}
		}
		sb.append(set.size() + "\n");

		for (String i : set) {
			sb.append(i + "\n");
		}
		System.out.println(sb.toString());
	}

}
