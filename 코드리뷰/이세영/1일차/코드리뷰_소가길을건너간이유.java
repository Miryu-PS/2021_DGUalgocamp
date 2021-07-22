import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] location = new int[10];
        for(int i=0; i<10; i++) location[i] = -1;
        int cnt = 0;
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int cow_num = Integer.parseInt(st.nextToken());
            int observed = Integer.parseInt(st.nextToken());
            if(location[cow_num-1]==-1) location[cow_num-1] = observed;
            else {
                if(location[cow_num-1]!=observed) {
                    cnt++;
                    location[cow_num-1] = observed;
                }
            }
        }
        System.out.println(cnt);
    }

}
