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

		Collections.sort(arr); // arr�� �������� ����
		Collections.sort(brr); // brr�� �������� ����

		int ans = 0, pnt = 0;
		for (int i = 0; i < N; i++) {
			while (pnt < N && brr.get(pnt) <= arr.get(i)) { // brr[pnt]�� arr[i]���� Ŀ�� ������ pnt++
				pnt++;
			}
			if (pnt == N)
				break; // �ش��ϴ� ���� ã�� �������� Ž���� �ߴ��Ѵ�.
			ans++;
			pnt++; // brr[pnt]�� arr[i]�� ��Ī��Ų��.
		}
		System.out.println(ans);
	}
}