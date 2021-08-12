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
        int L = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];

        for(int i = 0; i<= N; i++){
            graph.add(new ArrayList<Integer>());
        }

        for(int i = 0; i<L; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            graph.get(n).add(m);
            graph.get(m).add(n);
        }


        dfs(1);
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 1 ; i < visited.length ; i++){
            if(! visited[i]) {
                sb.append(i + "\n");
                count ++;
            }

        }
        if(count != 0) System.out.println(sb);
        else System.out.println(0);

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
