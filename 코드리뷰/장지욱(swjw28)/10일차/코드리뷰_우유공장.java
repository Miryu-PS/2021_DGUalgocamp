import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    
    static ArrayList<ArrayList<Integer>> front, back;
    static int n;
    static int cnt = 0;
    static boolean visit[];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        
        front = new ArrayList<ArrayList<Integer>>();
        back= new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i <= n; i++) {
            front.add(new ArrayList<Integer>());
            back.add(new ArrayList<Integer>());
        }
        
        StringTokenizer st;
        for(int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            
            front.get(p).add(q);
            back.get(q).add(p);
        }
        int result = -1;
        
        for(int i = 1; i <= n; i++) {
            visit = new boolean[n+1];
            cnt = 0;
            dfs(i, front);
            dfs(i, back);
            if(cnt == n-1) {
                result = i;
                break;
            }
        }
        System.out.println(result);
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