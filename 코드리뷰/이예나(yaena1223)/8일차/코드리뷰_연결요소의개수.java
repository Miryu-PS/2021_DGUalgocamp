import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {

    static ArrayList<ArrayList<Integer>> array;
    static boolean visited[];
    
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];
        array = new ArrayList<ArrayList<Integer>>();
        for(int i = 0 ;i<=n;i++) {
            array.add(new ArrayList<Integer>());
        }
        for(int i = 0;i<m;i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            array.get(a).add(b);
            array.get(b).add(a);
        }
        

        int cnt = 0;
    
        for(int i = 1;i<=n;i++) {
            if(visited[i]) continue;
            dfs(i);
            cnt++;
        }
        System.out.println(cnt);
    }

    static void dfs(int x) {
        visited[x] = true;
        for(int i : array.get(x)) {
            if(visited[i]==false)dfs(i);
        }
        
    }
}