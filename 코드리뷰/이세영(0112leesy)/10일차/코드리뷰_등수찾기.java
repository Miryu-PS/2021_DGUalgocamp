import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    static ArrayList<ArrayList<Integer>> fw, bw;
    static boolean visited[];
    static int cnt = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        visited = new boolean[N+1];
        fw = new ArrayList<ArrayList<Integer>>();
        bw = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<=N; i++) {
            fw.add(new ArrayList<Integer>());
            bw.add(new ArrayList<Integer>());
        }
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            fw.get(B).add(A);
            bw.get(A).add(B);
        }
        dfs(X, fw);
        int f_cnt = cnt;
        cnt = 0;
        dfs(X, bw);
        int b_cnt = N - cnt + 1;
        System.out.println(f_cnt+" "+b_cnt);
    }
    static void dfs(int x, ArrayList<ArrayList<Integer>> arr) {
        visited[x] = true;
        cnt++;
        for(int y : arr.get(x)) {
            if(!visited[y]) dfs(y, arr);
        }
    }

}
