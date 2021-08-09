import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(n-->0) {
            int e = Integer.parseInt(st.nextToken());
            hm.put(e, hm.getOrDefault(e, 0)+1);
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        while(m-->0) {
            int q = Integer.parseInt(st.nextToken());
            sb.append(hm.getOrDefault(q, 0)).append(" ");
        }
        System.out.println(sb);
        
    }
}
