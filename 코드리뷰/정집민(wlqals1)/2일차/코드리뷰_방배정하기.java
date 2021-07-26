import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a =Integer.parseInt(st.nextToken());
        int b =Integer.parseInt(st.nextToken());
        int c =Integer.parseInt(st.nextToken());
        
        int n =Integer.parseInt(st.nextToken());
        
        boolean flag = false;
        for (int i = 0; i*a <= n; i++) {
            for (int j = 0; j*b <= n; j++) {
                if((n-(i*a)-(j*b))>=0&&(n-(i*a)-(j*b))%c==0) {
                    flag = true;
                    break;
                }
            }
        }
        System.out.println(flag?"1":"0");
    }

}
