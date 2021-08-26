import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    static ArrayList<ArrayList<Integer>> arr_f, arr_b;
    static boolean visited[];
    static int cnt;

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        arr_f = new ArrayList<ArrayList<Integer>>();
        arr_b = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<=n; i++) {
            arr_f.add(new ArrayList<Integer>());
            arr_b.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr_f.get(x).add(y);
            arr_b.get(y).add(x);
        }
        
        visited = new boolean[n+1];
        cnt = 1;
        dfs(k, arr_b);
        int v = cnt;
        sb.append(v+" ");
        
        visited = new boolean[n+1];
        cnt = 0;
        dfs(k, arr_f);
        int u = n - cnt;
        sb.append(u);
            
        System.out.println(sb.toString());

    }

    static void dfs(int x, ArrayList<ArrayList<Integer>> list) {
        visited[x] = true;
        for(int i: list.get(x)) {
            if(visited[i] == false) {
                cnt++;
                dfs(i, list);
            }
        }
    }

}
