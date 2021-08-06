import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
	static int isPrime[];
	static int dist[];
	static int A, B;
	static int dx[] = { -1, 0, 1, 0 };
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st; 
		StringBuilder sb = new StringBuilder();
		
		isPrime = new int[10001]; // 소수면 0, 아니면 1
		for(int i=2; i<=100; i++) { // 에라토스테네스의 체
			if(isPrime[i] == 1) continue;
			for(int j=2*i; j<10000; j+=i) isPrime[j] = 1;
		}
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0){
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			
			Queue<Integer> queue = new LinkedList<>();
			dist = new int[10001];
			queue.offer(A); dist[A] = 1;
			while(!queue.isEmpty()) {
				int x = queue.poll();
				for(int y: getlist(x)) {
					if(dist[y] == 0) {
						dist[y] = dist[x] + 1;
						queue.offer(y);
					}
				}
			}
			
			if(dist[B] == 0) sb.append("Impossible\n");
			else sb.append((dist[B]-1)+"\n");
		}
		System.out.println(sb.toString());
	}
	public static ArrayList<Integer> getlist(int x) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1 ; i<10; i++) { // 천의 자리를 i로
			int tmp = i*1000 + (x%1000); 
			if(isPrime[tmp]==0 && x!=tmp) arr.add(tmp);
		}
		for(int i=0; i<10; i++) { // 백의 자리를 i로
			int tmp = (x/1000)*1000 + i*100 + (x%100);
			if(isPrime[tmp]==0 && x!=tmp) arr.add(tmp);
		}
		for(int i=0; i<10; i++) { // 십의 자리를 i로
			int tmp = (x/100)*100 + i*10 + (x%10);
			if(isPrime[tmp]==0 && x!=tmp) arr.add(tmp);
		}
		for(int i=0; i<10; i++) { // 일의 자리를 i로
			int tmp = (x/10)*10 + i;
			if(isPrime[tmp]==0 && x!=tmp) arr.add(tmp);
		}
		return arr;
	}
}
