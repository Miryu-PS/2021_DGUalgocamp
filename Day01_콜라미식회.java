
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
      	int M = Integer.parseInt(st.nextToken());
      	
      	int[] arr = new int[M + 1];
      	for (int i = 1; i <= M; i++) arr[i] = 0;
      	
      	for (int i = 0; i < N; i++) {
      		st = new StringTokenizer(br.readLine());
      		int K = Integer.parseInt(st.nextToken());
      		while (K-- > 0) {
      			arr[Integer.parseInt(st.nextToken())]++; 
      		}
      	}
      	
      	int ans = 0;
      	for (int i = 1; i <= M; i++) {
      		if (arr[i] == N) ans++;
      	}
      	System.out.print(ans);

        
    }
}