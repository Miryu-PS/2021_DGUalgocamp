import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[5]; 
        for(int i = 0; i < 5; i++) {
            arr[i] = 0;
        }
        
        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            if ((Y == 1) || (Y == 2)) arr[0]++;
            else if ((Y == 3) || (Y == 4)) {
                if (S == 1) arr[1]++;
                else arr[2]++;
            }
            else {
                if (S == 1) arr[3]++;
                else arr[4]++;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < 5; i++) {
                ans += (arr[i] + K - 1) / K; 
        }
        
        

        System.out.println(ans);
    }
}