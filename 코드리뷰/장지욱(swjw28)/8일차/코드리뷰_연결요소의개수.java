import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    
    static int n, m;
    static boolean visit[];
    static ArrayList<ArrayList<Integer>> Graphlist;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        visit = new boolean[n+1];
        Graphlist = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i <= n; i++) {
            Graphlist.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            Graphlist.get(x).add(y);
            Graphlist.get(y).add(x);
        }
        int cnt = 0;
        
        for(int i = 1; i <= n; i++) {
            if(!visit[i]) {
                dfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static void dfs(int idx) {
        visit[idx] = true;
        
        for(int k : Graphlist.get(idx)) {
            if(!visit[k]) {
                dfs(k);
            }
        }
    }
}