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

		Collections.sort(arr, Comparator.reverseOrder()); // arr�� �������� ����

		int ans = 0;
		for (int i = 0; i < N; i++) { // 0~i�� ���Ҹ� ����. = ���� �ִ� �߷��� ū i+1���� ������ ����.
			int tmp = arr.get(i) * (i + 1); // 0~i�� ������ �ּҰ��� i�� �����̴�.
			if (ans < tmp)
				ans = tmp;
		}
		System.out.println(ans);
	}
}