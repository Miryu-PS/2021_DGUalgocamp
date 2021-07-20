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
		mergesort(start, mid); // 왼쪽 절반 정렬
		mergesort(mid + 1, end); // 오른쪽 절반 정렬
		//임시 배열 tmp에 arr[start~end]을 정렬한 결과를 저장 
		int L = start; // 왼쪽 분할의 첫 인덱스
		int R = mid + 1; // 오른쪽 분할의 첫 인덱스
		for (int i = start; i <= end; i++) {
			if (L > mid) // 왼쪽 분할에 남은 원소가 없는 경우 
				tmp[i] = arr[R++];
			else if (R > end) // 오른쪽 분할에 남은 원소가 없는 경우
				tmp[i] = arr[L++];
			else if (arr[L] < arr[R]) // 왼쪽 분할의 원소가 더 작은 경우
				tmp[i] = arr[L++];
			else // 오른쪽 분할의 원소가 더 작은 경우
				tmp[i] = arr[R++];
		}
		for (int i = start; i <= end; i++) { // 임시로 저장해둔 tmp의 값들을 arr로 복사
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
