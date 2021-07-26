import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        
        while(true) {
            if(n % 5 == 0) {
                System.out.println(n/5 + cnt);
                break;
            }else if(n < 0) {
                System.out.println(-1);
                break;
            }
            n -= 3;
            cnt++;
        }
    }
}