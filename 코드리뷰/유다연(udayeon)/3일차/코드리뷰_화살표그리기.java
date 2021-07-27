import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int [] arr = new int [N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int count = 0;
        for(int i=0; i<N; i++) {
            for(int j=i; j<N; j++) {
                int total = 0;
                for(int k=i; k<=j; k++) {
                    total += arr[k];
                }
                if(total==M)
                    count++;
            }
        }
        
        System.out.println(count);
    }
}