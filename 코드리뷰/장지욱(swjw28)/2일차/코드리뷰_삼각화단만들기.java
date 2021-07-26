import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int half = n / 2;
        int cnt = 0;
        
        for(int i = half; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                for(int k = j; k >= 1; k--) {
                    if(i+j+k == n) {
                        if(j+k > i) {
                            cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}