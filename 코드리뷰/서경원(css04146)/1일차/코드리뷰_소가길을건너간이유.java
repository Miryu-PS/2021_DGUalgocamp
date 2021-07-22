import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // 관찰 횟수
        int count = 0; // 소들의 위치가 달라졌을 때마다 1씩 더한다.
        int b[] = new int[10]; // 각 소들의 위치
        int bnext[] = new int[10]; // 각 소들의 다음 위치
        for(int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken()); // 소의 번호
            int f = Integer.parseInt(st.nextToken()); // 소의 위치
            if(b[e-1] == 0) { // 소들의 위치가 처음 위치라면
                b[e-1] = f+1; // 0이 아닌 1을 더한 값을 소들의 위치로 저장
            }
            bnext[e-1] = f+1; // 처음 위치가 아니라면 다음 위치를 bnext에 저장
            if(bnext[e-1] != b[e-1]) // 소들의 위치가 처음 위치가 아니라면
                count++;
                b[e-1] = bnext[e-1];            
        }
        System.out.println(count);
    }
}