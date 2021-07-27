import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer =0 ;
        int from =0;
        int to = 0;
        int sum = arr[0];
        while(from<n&&to<n) {
            if(sum<m) {
                to++;
                if(to>=n) break;
                sum += arr[to];
            }else if(sum>m) {
                sum-=arr[from++];
            }else {
                answer++;
                to++;
                if(to>=n) break;
                sum += arr[to];
            }
        }
        
        
        System.out.println(answer);
        
        
    }

}
