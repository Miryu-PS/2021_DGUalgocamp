import java.io.BufferedReader;
// https://jhnyang.tistory.com/92
import java.io.InputStreamReader;
// https://makemethink.tistory.com/170
import java.util.StringTokenizer;
import java.io.IOException;
public class main {

    public static void main (String[] args)throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // throws IOException 필요
        StringBuilder sb = new StringBuilder(); // 라이브러리 필요 x
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        char[][] arr = new char[111][111];
        for(int i = 1; i <= a; i++) {
            String c = br.readLine();
            for(int j = 1; j <= b; j++) {
                arr[i][j] = c.charAt(j-1);
            }
        }
        int number = Integer.parseInt(br.readLine());
        for(int i = 1; i <= a; i++) {
            for(int k = 0; k < number; k++) {
                for(int j = 1; j <= b; j++) {
                    for(int l = 0; l < number; l++) {
                        sb.append(arr[i][j]);
                    }
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}