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
		Collections.sort(arrlist); // Array.sort�� ������� �ʴ� ���� �����ϴ�.
		Integer[] arr = arrlist.toArray(new Integer[0]);
		int p = -1, q = -1;
		for (int i = 0; i < 9; i++) {
			for (int j = i + 1; j < 9; j++) { // j�� i+1���� Ž��
				if (arr[i] + arr[j] == sum - 100) { // i�� �����̿� j�� �����̸� �������� �� ������ �����̵��� Ű ���� 100�� �ȴٸ�
					p = i;
					q = j; // �����ؾ� �� �� �������� ��ȣ�� p�� q�� ����
				}
			}
		}

		for (int i = 0; i < 9; i++) {
			if (i == p || i == q) // �����ؾ� �ϴ� �������� ��ȣ��� �Ѿ��.
				continue;
			sb.append(arr[i] + "\n");
		}
		System.out.println(sb.toString());
	}

}
