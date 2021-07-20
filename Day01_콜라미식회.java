
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader를 사용하기 위해서는 해당 메소드에 throws IOException 구문이 필수입니다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
      	int M = Integer.parseInt(st.nextToken());
      	
      	int[] arr = new int[M + 1]; // arr[i] = i번 콜라를 선호하는 북극곰의 수
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
      		if (arr[i] == N) ans++; // i번 콜라를 선호하는 북극곰의 수가 전체 북극곰의 수와 일치하면 모두가 좋아하는 콜라의 개수 추가
      	}
      	System.out.print(ans);

        
    }
}