import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int L = 0,W = 0;
        int total_n = R+B;
        for(int i=1;i*i<=total_n;i++) {
            if(total_n%i == 0) {
                int j = total_n/i;
                if((i-2)*(j-2) == B) {
                    L = j;
                    W = i;
                }
            }
        }
        System.out.println(L+" "+W);
    }

}