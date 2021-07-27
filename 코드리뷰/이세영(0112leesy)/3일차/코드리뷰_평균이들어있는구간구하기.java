import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        int cnt = 0;
        for(int i=0; i<N; i++) {
            int sum = 0;
            for(int j=i; j<N; j++) {
                sum += arr[j];
                double avg = (double)sum / (j-i+1);
                for(int k=i; k<=j; k++) {
                    if(arr[k]==avg) {
                        cnt++;
                        break;
                    }    
                }
            }
        }
        System.out.println(cnt);
    }

}
