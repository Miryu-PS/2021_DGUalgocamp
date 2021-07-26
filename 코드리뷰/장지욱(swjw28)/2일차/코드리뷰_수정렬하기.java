import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[1000001];
        
        int max = 0;
        
        for(int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[num]++;
            
            if(num > max) {
                max = num;
            }
        }
        
        for(int i = 0; i <= max; i++) {
            while(arr[i]-- > 0) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }
}