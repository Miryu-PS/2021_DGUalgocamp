
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
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[5]; //arr[5] = {1~2학년, 3~4 남, 3~4여, 5~6남, 5~6여}
        for(int i = 0; i < 5; i++) {
        	arr[i] = 0;
        }
        
        while (N-- > 0) {
        	st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            if ((Y == 1) || (Y == 2)) arr[0]++;
            else if ((Y == 3) || (Y == 4)) {
            	if (S == 1) arr[1]++;
            	else arr[2]++;
            }
            else {
            	if (S == 1) arr[3]++;
            	else arr[4]++;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            	ans += (arr[i] + K - 1) / K; // 각 그룹에 필요한 방의 개수를 계산
        }
        
        

        System.out.println(ans);
    }
}