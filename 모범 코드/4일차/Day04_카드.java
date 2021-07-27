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
		for (int i = 1; i <= N; i++) { // 1~N의 수를 queue에 차례로 넣고
			queue.offer(i);
		}
		while (queue.size() > 1) {
			int x = queue.poll(); // 처음 수는 버리고
			int y = queue.poll(); // 두번째 수는 queue의 맨 뒤로 보낸다.
			queue.offer(y);
		}
		System.out.println(queue.peek());
	}
}
