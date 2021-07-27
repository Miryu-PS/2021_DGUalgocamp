import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Queue;
import java.util.LinkedList;

public class main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<>();
		int N = Integer.parseInt(br.readLine());
		for (int i = 1; i <= N; i++) { // 1~N�� ���� queue�� ���ʷ� �ְ�
			queue.offer(i);
		}
		while (queue.size() > 1) {
			int x = queue.poll(); // ó�� ���� ������
			int y = queue.poll(); // �ι�° ���� queue�� �� �ڷ� ������.
			queue.offer(y);
		}
		System.out.println(queue.peek());
	}
}
