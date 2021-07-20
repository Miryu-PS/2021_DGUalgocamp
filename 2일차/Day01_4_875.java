import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Day01_4_875 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> arrlist = new ArrayList<>();
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int x = Integer.parseInt(br.readLine());
			arrlist.add(x);
			sum += x;
		}
		Collections.sort(arrlist); // Array.sort는 사용하지 않는 것이 좋습니다.
		Integer[] arr = arrlist.toArray(new Integer[0]);
		int p = -1, q = -1;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) { // j는 i+1부터 탐색
				if (arr[i] + arr[j] == sum - 100) { // i번 난쟁이와 j번 난쟁이를 제외했을 때 나머지 난쟁이들의 키 합이 100이 된다면
					p = i;
					q = j; // 제외해야 할 두 난쟁이의 번호를 p와 q에 저장
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			if (i == p || i == q) // 제외해야 하는 난쟁이의 번호라면 넘어간다.
				continue;
			sb.append(arr[i] + "\n");
		}
		System.out.println(sb.toString());
	}

}
