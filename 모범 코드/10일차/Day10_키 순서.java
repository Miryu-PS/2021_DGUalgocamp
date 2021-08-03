import java.util.*;
import java.io.*;
 
public class main {
 
	static int N, M, cnt;
	// 정방향 역방향 연결요소를 저장하기 위해 2차원 인접 리스트 생성
	static ArrayList<ArrayList<Integer>> fw, bk;
	// 방문체크를 위한 배열 역시 정방향과 역방향 모두 고려하기 위해 2차원으로 생성
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		fw = new ArrayList<ArrayList<Integer>>();
		bk = new ArrayList<ArrayList<Integer>>();
		for(int i=0; i<=N ; i++) {
			fw.add(new ArrayList<Integer>());
			bk.add(new ArrayList<Integer>());
		}
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			fw.get(u).add(v);
			bk.get(v).add(u);
		}
		
		int ans = 0;
		for(int i = 1; i <= N; i++) {
			visit = new boolean[N + 1];
			cnt = 0;
			dfs(i, fw);
			dfs(i, bk);
			if(cnt == N) ans ++;
		}
		System.out.println(ans);
	}
	public static void dfs(int x, ArrayList<ArrayList<Integer>> list) {
		if(visit[x]==false) {
			cnt++;
		}
		visit[x] = true;
		for(int y : list.get(x)) {
			if(!visit[y]) {
				dfs(y, list);
			}
		}
	}
}