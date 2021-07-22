import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int MAXN = 100100;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[MAXN]; 
        int[][] brr = new int[MAXN][2];
        int answer = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            brr[i][0] = Integer.parseInt(st.nextToken());
            brr[i][1] = Integer.parseInt(st.nextToken());
            for (int j = brr[i][0]; j < brr[i][1]; j++) { 
                arr[j]++;
            }
        }
        
        for (int i = 0; i < N; i++) 
        {
    
            for (int j = brr[i][0]; j < brr[i][1]; j++)
                arr[j]--;

            int safetime = 0; 
            for (int j = 0; j < MAXN; j++) {
                if (arr[j] != 0) 
                    safetime++;
            }

            
            if (answer < safetime)
                answer = safetime;

    
            for (int j = brr[i][0]; j < brr[i][1]; j++)
                arr[j]++;
        }

        System.out.println(answer);
    }
}