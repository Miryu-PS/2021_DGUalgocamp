import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day01_10_4666 {
	public static int[] arr;
	public static int[] tmp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		tmp = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		mergesort(0, N - 1);

		for (int i = 0; i < N; i++) {
			sb.append(arr[i] + " ");
		}

		System.out.println(sb.toString());
	}

	public static void mergesort(int start, int end) {
		if (start == end)
			return;
		int mid = (start + end) / 2;
		mergesort(start, mid); // ���� ���� ����
		mergesort(mid + 1, end); // ������ ���� ����
		//�ӽ� �迭 tmp�� arr[start~end]�� ������ ����� ���� 
		int L = start; // ���� ������ ù �ε���
		int R = mid + 1; // ������ ������ ù �ε���
		for (int i = start; i <= end; i++) {
			if (L > mid) // ���� ���ҿ� ���� ���Ұ� ���� ��� 
				tmp[i] = arr[R++];
			else if (R > end) // ������ ���ҿ� ���� ���Ұ� ���� ���
				tmp[i] = arr[L++];
			else if (arr[L] < arr[R]) // ���� ������ ���Ұ� �� ���� ���
				tmp[i] = arr[L++];
			else // ������ ������ ���Ұ� �� ���� ���
				tmp[i] = arr[R++];
		}
		for (int i = start; i <= end; i++) { // �ӽ÷� �����ص� tmp�� ������ arr�� ����
			arr[i] = tmp[i];
		}
	}
	
	public static void main_(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int[] arr2 = new int[N];
		for (int i = 0; i < N; i++) {
			arr2[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr2);

		for (int i = 0; i < N; i++) {
			sb.append(arr2[i] + " ");
		}

		System.out.println(sb.toString());
	}

}
