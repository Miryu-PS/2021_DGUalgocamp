import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int L = 1;
        int W = 1;
        for(int i=1; i*i<=R+B; i++) {
            if((R+B)%i == 0) {
                L = (R+B)/i;
                W = i;
                if((2*(L+W-2)==R) && ((L-2)*(W-2)==B)) {
                    System.out.println(L+" "+W);
                }
            }
        }

    }

}
