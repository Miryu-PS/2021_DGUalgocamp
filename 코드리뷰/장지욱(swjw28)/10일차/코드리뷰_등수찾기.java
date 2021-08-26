import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    
    static ArrayList<ArrayList<Integer>> front, back;
    static int n, m, x;
    static int cnt;
    static boolean visit[];
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());
        
        front = new ArrayList<ArrayList<Integer>>();
        back = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i <= n; i++) {
            front.add(new ArrayList<Integer>());
            back.add(new ArrayList<Integer>());
        }
        
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            front.get(a).add(b);
            back.get(b).add(a);
        }
        
        visit = new boolean[n+1];
        cnt = 1;
        dfs(x, back);
        sb.append(cnt).append(" ");
        
        cnt = 0;
        dfs(x, front);
        sb.append(n - cnt);
        
        System.out.println(sb);
    }
    static void dfs(int x, ArrayList<ArrayList<Integer>> list) {
        visit[x] = true;
        
        for(int y : list.get(x)) {
            if(!visit[y]) {
                cnt++;
                dfs(y, list);
            }
        }
    }
}