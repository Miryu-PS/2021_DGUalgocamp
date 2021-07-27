import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        int cnt = 0;
        for(int i=0; i<N; i++) {
            int sum = 0;
            for(int j=i; j<N; j++) {
                sum += arr[j];
                if(sum==M) {
                    cnt++;
                    break;
                }
                if(sum>M) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }

}
