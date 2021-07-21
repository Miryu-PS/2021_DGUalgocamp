
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader�� ����ϱ� ���ؼ��� �ش� �޼ҵ忡 throws IOException ������ �ʼ��Դϴ�.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
      	int M = Integer.parseInt(st.nextToken());
      	
      	int[] arr = new int[M + 1]; // arr[i] = i�� �ݶ� ��ȣ�ϴ� �ϱذ��� ��
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
      		if (arr[i] == N) ans++; // i�� �ݶ� ��ȣ�ϴ� �ϱذ��� ���� ��ü �ϱذ��� ���� ��ġ�ϸ� ��ΰ� �����ϴ� �ݶ��� ���� �߰�
      	}
      	System.out.print(ans);

        
    }
}