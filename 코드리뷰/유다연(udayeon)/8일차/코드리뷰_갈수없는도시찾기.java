import java.io.*;
import java.util.*;

public class main{
    
    static int N, M, count;
    static ArrayList<ArrayList<Integer>> graph;
    static boolean [] visited;
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList<ArrayList<Integer>>();
        visited = new boolean [N+1];
        
        for(int i=0; i<=N; i++) {
            graph.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        
        count = 0;
        dfs(1);
        if(count==N) {
            System.out.println(0);
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(int i=1; i<=N; i++) {
                if(visited[i]==false) {
                    sb.append(i+"\n");
                }
            }
            System.out.println(sb.toString());
        }
    }
    
    public static void dfs(int x) {
        visited[x] = true;
        count++;
        for(int y : graph.get(x)) {
            if(visited[y]==false)
                dfs(y);
        }
    }
}