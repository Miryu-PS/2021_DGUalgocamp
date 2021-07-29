import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> brr = new ArrayList<Integer>();

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr.add(Integer.parseInt(st.nextToken()));

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			brr.add(Integer.parseInt(st.nextToken()));

		Collections.sort(arr); // arr을 오름차순 정렬
		Collections.sort(brr, Comparator.reverseOrder()); // brr은 내림차순 정렬

		int ans = 0;
		for (int i = 0; i < N; i++) {
			ans += arr.get(i) * brr.get(i);
		}
		System.out.println(ans);
	}
}