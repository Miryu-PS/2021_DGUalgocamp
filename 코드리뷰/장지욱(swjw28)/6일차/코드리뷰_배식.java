import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[1001];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int p = Integer.parseInt(st.nextToken());
            arr[p]++;
        }
        
        int sum = 0;
        int last = 0;
        
        for(int i = 1; i < arr.length; i++) {
            while(arr[i]-- > 0) {
                last = last + i;
                sum += last;
            }
        }
        System.out.println(sum);
    }
}