
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
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] cars = new int[100]; // cars[i]; i <= t < i + 1인 시간에 주차되어있는 차의 수
        for (int i = 0; i < 100; i++) {
        	cars[i] = 0;
        }
        
        st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        for (int i = t1; i < t2; i++) {
        	cars[i]++;
        }
        st = new StringTokenizer(br.readLine());
        t1 = Integer.parseInt(st.nextToken());
        t2 = Integer.parseInt(st.nextToken());
        for (int i = t1; i < t2; i++) {
        	cars[i]++;
        }
        st = new StringTokenizer(br.readLine());
        t1 = Integer.parseInt(st.nextToken());
        t2 = Integer.parseInt(st.nextToken());
        for (int i = t1; i < t2; i++) {
        	cars[i]++;
        }
        
        int ans = 0;
        //i <= t < i + 1인 시간에 부과되는 금액 계산
        for (int i = 0; i < 100; i++) {
        	switch(cars[i]) {
        	case 1:
        		ans += A;
        		break;
        	case 2:
        		ans += 2 * B;
        		break;
        	case 3:
        		ans += 3 * C;
        		break;
        	}
        }
        System.out.println(ans);
    }
}