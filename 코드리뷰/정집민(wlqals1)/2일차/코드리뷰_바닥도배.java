import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int area = r+b;
        for (int i = 3; i <= Math.sqrt(area); i++) {
            if(area%i==0&&((area/i-2)*(i-2))==b) {
                System.out.print(area/i+ " " + i);
                break;
            }
        }
    }

}
