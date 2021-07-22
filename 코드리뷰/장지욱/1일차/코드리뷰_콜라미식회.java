import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int coke[] = new int[m+1];
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            int k = Integer.parseInt(st.nextToken());
            for(int j = 0; j < k; j++) {
                int num = Integer.parseInt(st.nextToken());
                coke[num]++;
            }
        }
        int cnt = 0;
        for(int i = 1; i < coke.length; i++) {
            if(coke[i] == n) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}