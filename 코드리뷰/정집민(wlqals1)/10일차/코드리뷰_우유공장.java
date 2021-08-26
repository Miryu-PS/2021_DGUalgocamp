import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    static boolean pos;
    static int cnt;
    static boolean[] visit;
    static ArrayList<ArrayList<Integer>> in;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        in = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            in.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            in.get(q).add(p);
        }
        
        for (int i = 1; i <= n; i++) {
            visit = new boolean[n+1];
            cnt =0;
            dfs(i);
            if(cnt==n) {
                pos= true;
                System.out.println(i);
                break;
            }
        }
        if(!pos) System.out.println(-1);
    }
    static void dfs(int i) {
        if(visit[i]) return;
        visit[i] = true;
        cnt++;
        for(int y:in.get(i)) {
            if(!visit[y]) {
                dfs(y);
            }
        }
    }
}
