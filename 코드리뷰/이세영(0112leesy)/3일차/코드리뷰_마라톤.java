import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[][] arr;
    static int dist(int i, int j) {
        return Math.abs(arr[j][0]-arr[i][0]) + Math.abs(arr[j][1]-arr[i][1]);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][2];
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        int total = 0;
        for(int i=0; i<N-1; i++) {
            total += dist(i,i+1);
        }
        int min = total;
        for(int i=1; i<N-1; i++) {
            int skip = dist(i-1, i) + dist(i, i+1) - dist(i-1, i+1);
            int skipped = total - skip;
            if(skipped < min) min = skipped;
        }
        System.out.println(min);
    }

}
