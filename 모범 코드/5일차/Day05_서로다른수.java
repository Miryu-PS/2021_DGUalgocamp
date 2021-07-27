import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.HashSet;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		TreeSet<Integer> set = new TreeSet<>();
		// HashSet<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(st.nextToken());
			set.add(x);
		}
		System.out.println(set.size());
	}

}
