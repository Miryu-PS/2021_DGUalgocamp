import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main {
    
    static int n, m;
    static boolean visit[];
    static ArrayList<ArrayList<Integer>> Graphlist;
    static PriorityQueue<Integer> pq;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visit = new boolean[n+1];
        Graphlist = new ArrayList<ArrayList<Integer>>();
        pq = new PriorityQueue<Integer>();
        
        for(int i = 0; i <= n; i++) {
            Graphlist.add(new ArrayList<Integer>());
            if(i > 0) {
                pq.offer(i);
            }
        }
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            Graphlist.get(x).add(y);
            Graphlist.get(y).add(x);
        }
        dfs(1);
        if(pq.isEmpty()) {
            sb.append(0);
        }
        else {
            while(!pq.isEmpty()) {
                sb.append(pq.poll()).append('\n');
            }
        }
        System.out.println(sb);
    }
    static void dfs(int idx) {
        visit[idx] = true;
        pq.remove(idx);
        
        for(int i = 1; i < Graphlist.size(); i++) {
            for(int k : Graphlist.get(idx)) {
                if(!visit[k]) {
                    dfs(k);
                }
            }
        }
    }
}