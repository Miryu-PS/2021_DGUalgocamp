import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.PriorityQueue;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> pq = new PriorityQueue<>();
		// ���� ������ ������ �켱���� ť
		// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		// ū ������ ������ �켱���� ť
		// ������ �����θ� ���� �����մϴ�
		// PriorityQueue<Object> pq_name = new PriorityQueue<>();
		for (int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x != 0)
				pq.offer(x);
			else {
				if (pq.isEmpty())
					sb.append("0\n");
				else
					sb.append(pq.poll() + "\n");
			}
		}
		System.out.println(sb.toString());
	}

}
