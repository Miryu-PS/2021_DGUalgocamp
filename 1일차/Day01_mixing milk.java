
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
	
	public static int minimum(int a, int b) {
		if (a < b) return a;
		return b;
	}
    public static void main(String[] args) throws IOException{ // BufferedReader를 사용하기 위해서는 해당 메소드에 throws IOException 구문이 필수입니다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] cap = new int[3]; // cap[i]; i + 1번 양동이의 용량
        int[] qua = new int[3]; // qua[i]; i + 1번 양동이에 들어있는 우유의 양
        for (int i = 0; i < 3; i++) {
        	st = new StringTokenizer(br.readLine());
        	cap[i] = Integer.parseInt(st.nextToken());
         	qua[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 100; i++) {
        	int x = minimum(qua[i % 3] + qua[(i + 1) % 3], cap[(i + 1) % 3]); // i번 양동이의 우유를 j번 양동이에 부었을 때, j번 양동이에 남아있는 우유의 양
        	qua[i % 3] = qua[i % 3] + qua[(i + 1) % 3] - x; // i번 양동이의 우유를 j번 양동이에 부었을 때, i번 양동이에 남아있는 우유의 양
        	qua[(i + 1) % 3] = x;
        }
        System.out.println(Integer.toString(qua[0]) + "\n" + Integer.toString(qua[1]) + "\n" + Integer.toString(qua[2]));
    }
}