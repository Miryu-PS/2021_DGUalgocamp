
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
        
        int N = Integer.parseInt(br.readLine());
        
        int[] loc = new int[11]; // loc[i]; i번 소의 위치, -1 : 아직 위치가 관찰되지 않은 소, 0 : 왼쪽에서 관찰된 소, 1 : 오른쪽에서 관찰된 소
        for (int i = 0; i < 11; i++) {
        	loc[i] = -1;
        }
        
        int ans = 0;
        while (N-- > 0) {
        	st = new StringTokenizer(br.readLine());
            int cownum = Integer.parseInt(st.nextToken());
            int cowloc = Integer.parseInt(st.nextToken());
            // 이전에 관찰된 위치와 다른 위치에서 관찰될 경우, 길을 건넌 횟수를 추가
            if ((loc[cownum] != -1) && (loc[cownum] != cowloc)) {
            	ans++;
            }
            loc[cownum] = cowloc;
        }
        System.out.println(ans);
    }
}