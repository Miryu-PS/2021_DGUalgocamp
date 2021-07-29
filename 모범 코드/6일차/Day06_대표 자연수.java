import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++)
			arr.add(Integer.parseInt(st.nextToken()));

		Collections.sort(arr); // arr을 오름차순 정렬

		System.out.println(arr.get((N - 1) / 2)); // N=5일때 arr[2], N=6일때 arr[2], N=7일때 arr[3]
	}
}