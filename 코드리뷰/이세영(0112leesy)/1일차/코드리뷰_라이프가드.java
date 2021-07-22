import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] total = new int[1000];
        int[][] worktime = new int[N][2];
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            worktime[i][0] = Integer.parseInt(st.nextToken());
            worktime[i][1] = Integer.parseInt(st.nextToken());
            for(int j=worktime[i][0]; j<worktime[i][1]; j++) total[j]++;
        }
        int safetime = 0;
        for(int i=0; i<1000; i++) if(total[i]>0) safetime++;
        int min = 1000;
        for(int i=0; i<N; i++) {
            int check = worktime[i][0];
            int cnt = 0;
            while(check<worktime[i][1]) {
                if(total[check]==1) cnt++;
                check++;
            }
            if(cnt<min) min = cnt;
        }
        System.out.println(safetime-min);
    }

}
