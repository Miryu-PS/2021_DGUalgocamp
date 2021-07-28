import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < N; i++)
			arr.add(Integer.parseInt(br.readLine()));

		Collections.sort(arr, Comparator.reverseOrder()); // arr을 내림차순 정렬

		int ans = 0;
		for (int i = 0; i < N; i++) { // 0~i번 원소를 본다. = 가장 최대 중량이 큰 i+1개의 밧줄을 고른다.
			int tmp = arr.get(i) * (i + 1); // 0~i번 원소의 최소값은 i번 원소이다.
			if (ans < tmp)
				ans = tmp;
		}
		System.out.println(ans);
	}
}