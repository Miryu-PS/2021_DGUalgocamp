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
		Collections.sort(brr); // brr을 오름차순 정렬

		int ans = 0, pnt = 0;
		for (int i = 0; i < N; i++) {
			while (pnt < N && brr.get(pnt) <= arr.get(i)) { // brr[pnt]가 arr[i]보다 커질 때까지 pnt++
				pnt++;
			}
			if (pnt == N)
				break; // 해당하는 값을 찾지 못했으면 탐색을 중단한다.
			ans++;
			pnt++; // brr[pnt]와 arr[i]를 매칭시킨다.
		}
		System.out.println(ans);
	}
}