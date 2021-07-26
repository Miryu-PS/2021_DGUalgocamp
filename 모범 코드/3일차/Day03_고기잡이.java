import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        
        int arr[][] = new int[N][M];
        int ans = 0;
        
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int i = 0; i+W-1 < N; i++){ // �׹��� ���� �� ��ǥ (i,j) ������ �Ʒ� ��ǥ (i+W-1, j+H-1)
			for(int j = 0; j+H-1 < M ; j++) {
				int sum = 0;
				for(int ii = i; ii < i+W; ii++) {
					for(int jj = j; jj < j+H; jj++){
						sum += arr[ii][jj];
					}
				}
				ans = Math.max(ans, sum);
			}
		}
        System.out.println(ans); // �ð����⵵ O(NMWH) �Ǵ� W<=N, H<=M �̹Ƿ� O(N^2*M^2)
    }
}