
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader를 사용하기 위해서는 해당 메소드에 throws IOException 구문이 필수입니다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
//        // 입력 형태 : "N"
//        int N = Integer.parseInt(br.readLine());
//        
//        // 입력 형태 : "N1 N2" 
//        st = new StringTokenizer(br.readLine());
//        int N1 = Integer.parseInt(st.nextToken());
//        int N2 = Integer.parseInt(st.nextToken());
//        
//        // 입력 형태 : "string"
//        String str = br.readLine();
//        
//        // 입력 형태 : "string1 string2 string3"
//        st = new StringTokenizer(br.readLine());
//        String str1 = st.nextToken();
//        String str2 = st.nextToken();
//        String str3 = st.nextToken();
        
        int n = Integer.parseInt(br.readLine());
        boolean[][] x = new boolean[100][100];
        for (int i = 0; i < 100; i++) {
        	for (int j = 0; j < 100; j++) x[i][j] = false;
        }
        
        int ans = 0;
        while(n-- > 0) {
        	st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()), y1 = Integer.parseInt(st.nextToken());
            
            for (int i = 0; i < 10; i++) {
            	for (int j = 0; j < 10; j++) {
            		if(!x[x1 + i][y1 + j]) {
            			x[x1 + i][y1 + j] = true;
            			ans++;
            		}
            	}
            }
        }
        System.out.println(ans);
    }
}