import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    
    static ArrayList<ArrayList<Integer>> graph;
    static boolean visited[];
    static int cnt;

    public static void main(String[] args) throws  IOException { // 우유 공장 
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<n-1; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(y).add(x);
        }
        
        boolean pos = false;
        for(int i=1; i<=n; i++) {
            visited = new boolean[n+1];
            cnt = 0;
            dfs(i);
            if(cnt == n-1) {
                sb.append(i);
                pos = true;
            }
        }
        if(pos) {
            System.out.println(sb.toString());
        }
        else System.out.println(-1);

    }
    static void dfs(int x) {
        visited[x] = true;
        for(int i: graph.get(x)) {
            if(visited[i] == false) {
                cnt++;
                dfs(i);
            }
        }
    }

}
