import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[3][2];
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // IOException 필요 
            a[i][0] = Integer.parseInt(st.nextToken()); // 양동이의 용량
            a[i][1] = Integer.parseInt(st.nextToken()); // 현재 들어있는 우유의 양
        }
        int b = 0; // 따르는 통 ( 0, 1, 2 )
        int c = 0; // 받는 통 ( 0, 1, 2 )
        for(int i = 0; i < 100; i++) {
            b = i % 3; // 따르는 통은 0부터 시작해서 1로 끝
            c = (b + 1) % 3; // 받는 통은 1부터 시작해서 2로 끝
            if(a[c][1] + a[b][1] <= a[c][0]) { // 받는 통과 따르는 통의 양이 받는 통의 양동이 크기보다 작거나 같을 때
                a[c][1] += a[b][1];  // 받는 통에 따르는 통의 우유를 따른다.
                a[b][1] = 0; // 따르는 통의 양은 0이 된다.                
            }
            else { // 받는 통과 따르는 통의 양이 받는 통의 양동이 크기보다 크다면
                if(a[c][1] == a[c][0]) { // 받는 통의 우유가 다 떨어지지 않는다면 멈춤.
                    break;
                }
                else {
                    //b=1, c=2
                    a[b][1] = a[b][1] + a[c][1] - a[c][0];
                    a[c][1] = a[c][0]; // 받는 통의 양은 받는 통의 양동이 크기와 같다.
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.println(a[i][1]);
        }
    }
}