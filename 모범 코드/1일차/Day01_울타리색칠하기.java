
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader를 사용하기 위해서는 해당 메소드에 throws IOException 구문이 필수입니다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
        
        boolean[] x = new boolean[100]; // x[i]; [i, i + 1)인 구간에 색칠되어있는지 여부
        
        for(int i = 0; i < 100; i++) x[i] = false;
        for(int i = a; i < b; i++) {
        	x[i] = true;
        }
        for(int i = c; i < d; i++) {
        	x[i] = true;
        }
        
        int ans = 0;
        for(int i = 0; i < 100; i++) {
        	if (x[i]) ans++;
        }
        System.out.println(ans);
    }
}