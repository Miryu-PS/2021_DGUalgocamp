import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean arr[][] = new boolean[11][2];
        
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int num = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            
            if(arr[num][d]) {
                continue;
            }
            if(arr[num][0]) {
                arr[num][d] = true;
                arr[num][0] = false;
                cnt++;
            }else if(arr[num][1]) {
                arr[num][d] = true;
                arr[num][1] = false;
                cnt++;
            }else {
                arr[num][d] = true;
                
            }
        }
        System.out.println(cnt);
    }
}