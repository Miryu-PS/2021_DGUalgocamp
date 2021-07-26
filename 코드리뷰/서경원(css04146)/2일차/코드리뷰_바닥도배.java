import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int sum = R + B; // R과 B의 합
        for(int i = sum/3; i >= 3; i--) {
            if((R+B) % i == 0) { // 공약수라면
                if((i - 2) * (sum / i - 2) == B) {
                    System.out.println(i + " " + sum/i);
                    break;
                }
            }
        }
    }
}