import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int cnt = n;
        
        for(int i = 0; i < n-1; i++) {
            int temp[] = new int[n-i];
            int idx = 0;
            temp[idx++] = arr[i];
            int sum = temp[0];
            
            for(int j = i+1; j < n; j++) {
                temp[idx++] = arr[j];
                sum += arr[j];
                double avg = (double) sum / idx;
                for(int k : temp) {
                    if(k == avg) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}