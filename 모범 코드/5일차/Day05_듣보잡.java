import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		TreeSet<String> set = new TreeSet<>();
		TreeSet<String> set2 = new TreeSet<>();
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			boolean chk = set.add(str);
		}
		
		int ans = 0;
		for (int i = 0; i < M; i++) {
			String str = br.readLine();
			boolean chk = set2.add(str);
			if (set.contains(str)) {
				ans++;
			}
		}
		System.out.println(ans);
	}

}
