import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    
    static ArrayList<ArrayList<Integer>> Graphlist;
    static boolean visited[];

    public static void main(String[] args) throws IOException { // 갈수없는 도시찾기 
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Graphlist = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[n+1];
        
        for(int i=0; i<=n; i++) {
            Graphlist.add(new ArrayList<Integer>());
        }
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            Graphlist.get(p).add(q);
            Graphlist.get(q).add(p);
        }
        
        dfs(1);
        
        int ans = 0;
        for(int i=2; i<=n; i++) {
            if(visited[i] == false) {
                sb.append(i+"\n");
                ans++;
            }
        }
        if(ans == 0) {
            System.out.println(0);
        }
        else System.out.println(sb.toString());

    }
    static void dfs(int x) {
        visited[x] = true;
        for(int y: Graphlist.get(x)) {
            if(visited[y] == false) {
                dfs(y);
            }
        }
    }

}
