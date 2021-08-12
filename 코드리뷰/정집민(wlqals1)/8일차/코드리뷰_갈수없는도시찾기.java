import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;



class main{
    static ArrayList<ArrayList<Integer>> arr;
    static boolean[] chk;
    public static void main(String[] args)throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        arr = new ArrayList<>();
        chk = new boolean[n+1];
        for(int i=0;i<=n;i++){
            arr.add(new ArrayList<Integer>());
        }
        for(int i =0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            arr.get(from).add(to);
            arr.get(to).add(from);
        }
        dfs(1);
        boolean flag = false;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            if(!chk[i]) {
                flag = true;
                sb.append(i).append('\n');
            }
        }
        System.out.print(flag?sb:0);
        
    }
    static void dfs(int x){
        if(chk[x]) return;
        chk[x] = true;
        for(int i:arr.get(x)){
            dfs(i);
        }
    }
}