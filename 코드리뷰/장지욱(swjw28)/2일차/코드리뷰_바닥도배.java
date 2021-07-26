import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int l = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        
        int sum = l+w;
        
        for(int i = 3; i <= Math.sqrt(sum); i++) {
            if(sum % i == 0) {
                if((i - 2) * (sum/i - 2) == w) {
                    System.out.println((sum/i) + " " + (i));
                    break;
                }
            }
        }
    }
}