import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int a=(n-1)/2; a>0; a--) {
            int b_plus_c = n-a;
            for(int i=1; i<=b_plus_c/2; i++) {
                int b = i;
                int c = b_plus_c-b;
                if(a>=c) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }

}
