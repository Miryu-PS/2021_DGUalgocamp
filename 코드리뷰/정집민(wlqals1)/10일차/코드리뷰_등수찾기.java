import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    static ArrayList<ArrayList<Integer>> up,down;
    static boolean[] visit;
    static int cnt;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int target = Integer.parseInt(st.nextToken());
        up = new ArrayList<>();
        down = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            up.add(new ArrayList<Integer>());
            down.add(new ArrayList<Integer>());
        }
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int high = Integer.parseInt(st.nextToken());
            int low = Integer.parseInt(st.nextToken());
            up.get(low).add(high);
            down.get(high).add(low);
        }
        //위쪽으로 몇명
        visit = new boolean[n+1];
        cnt=0;
        dfs(target,up);
        int upward = cnt;
        //밑으로 몇명
        visit = new boolean[n+1];
        cnt=0;
        dfs(target,down);
        int downward = cnt;
        System.out.println(upward+ " " +(n-downward+1));
        
    }
    static void dfs(int i,ArrayList<ArrayList<Integer>> arr) {
        if(visit[i]==false) {
            cnt++;
        }
        visit[i] = true;
        for(int y:arr.get(i)) {
            if(!visit[y]) {
                dfs(y,arr);
            }
        }
    }
}
