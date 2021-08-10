import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int weight[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            weight[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(weight);
        
        int max = 0;
        int cnt = n;
        
        for(int i = 0; i < weight.length; i++) {
            int sum = weight[i] * cnt;
            
            if(sum > max) {
                max = sum;
            }
            cnt--;
        }
        System.out.println(max);
    }
}