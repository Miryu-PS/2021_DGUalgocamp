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
            int city1 = Integer.parseInt(st.nextToken());
            int city2 = Integer.parseInt(st.nextToken());
            Graphlist.get(city1).add(city2);
            Graphlist.get(city2).add(city1);
        }
        dfs(1);
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=N; i++) if(!visited[i]) sb.append(i+"\n");
        if(sb.toString().isEmpty()) System.out.println(0);
        else System.out.println(sb.toString());
        
    }
    static void dfs(int city) {
        visited[city] = true;
        for(int i : Graphlist.get(city)) {
            if(visited[i] == false) dfs(i);
        }
    }

}
