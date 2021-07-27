import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int N, M, W, H;
    static int[][] pond;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        W = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        pond = new int[N][M];
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                pond[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i <= N-W; i++) {
            for (int j = 0; j <= M-H; j++) {
                int value = 0;
                for (int x = 0; x < W; x++) {
                    for (int y = 0; y < H; y++) {
                        value += pond[i+x][j+y];
                    }
                }
                if(value>maxValue) maxValue = value;
                
            }
        }
//        for (int i = 0; i <= N-H; i++) {
//            for (int j = 0; j <= M-W; j++) {
//                int value = 0;
//                for (int x = 0; x < W; x++) {
//                    for (int y = 0; y < H; y++) {
//                        value += pond[i+y][j+x];
//                    }
//                }
//                if(value>maxValue) maxValue = value;
//                
//            }
//        }
        
        System.out.println(maxValue);
    }
}
