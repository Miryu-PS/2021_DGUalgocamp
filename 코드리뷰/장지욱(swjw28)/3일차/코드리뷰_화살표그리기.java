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
        
        int arr[] = new int[n];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            int sum = arr[i];
            if(sum == m) {
                cnt++;
                continue;
            }
            
            for(int j = i+1; j < n; j++) {
                sum += arr[j];
                if(sum == m) {
                    cnt++;
                    break;
                }else if(sum > m) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}