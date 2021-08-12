import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    static ArrayList<ArrayList<Integer>> Graphlist;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        visited = new boolean[N+1];
        Graphlist = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=N; i++) Graphlist.add(new ArrayList<Integer>());
        
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());
            Graphlist.get(node1).add(node2);
            Graphlist.get(node2).add(node1);
        }
        
        int cnt = 0;
        for(int i=1; i<=N; i++) {
            if(!visited[i]) {
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);

    }
    static void dfs(int node) {
        visited[node] = true;
        for(int i : Graphlist.get(node)) {
            if(!visited[i]) dfs(i);
        }
    }

}
