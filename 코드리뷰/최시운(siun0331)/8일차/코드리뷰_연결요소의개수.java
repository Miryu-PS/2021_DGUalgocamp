import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static boolean[] visited;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited =  new boolean[N+1];

        for(int i = 0; i<= N; i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            graph.get(x).add(y);
            graph.get(y).add(x);
        }

        dfs(1);
        int count = 0;
        for(int i =0; i < visited.length; i++){
            if(! visited[i]){
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    public static void dfs(int x){
        visited[x] = true;
        for(int i = 0; i< graph.get(x).size(); i++){
            int y = graph.get(x).get(i);
            if(! visited[y]) {
                dfs(y);
            }
        }

    }
}
