import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[] arr = new int[5];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        while(N-->0) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            if(y==1||y==2) {
                arr[0]++;
            }else if(y==3||y==4) {
                if(s==1) arr[1]++;
                else arr[2]++;
            }else {
                if(s==1) arr[3]++;
                else arr[4]++;
            }
        }
        
        int room = 0;
        for (int i = 0; i < arr.length; i++) {
            room += (arr[i]+K-1)/K;
        }
        System.out.println(room);
    }
}
