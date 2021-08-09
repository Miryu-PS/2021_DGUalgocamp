import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> hs1 = new HashSet<String>();
        HashSet<String> hs2 = new HashSet<String>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        while(n-->0) {
            hs1.add(br.readLine());
        }
        while(m-->0) {
            hs2.add(br.readLine());
        }
        
        int cnt=0;
        for(String name:hs1) {
            if(hs2.contains(name))cnt++;
        }
        
        
        System.out.println(cnt);
    }

}
