import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[] timeline = new int[100];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            for (int j = from; j < to; j++) {
                timeline[j]++;
            }
        }
        int fare = 0;
        for (int i = 0; i < timeline.length; i++) {
            if(timeline[i]==0) {
                continue;
            }else if(timeline[i]==1) {
                fare = fare + a;
            }else if(timeline[i]==2) {
                fare = fare + 2*b;
            }else {
                fare = fare + 3*c;
            }
        }
        System.out.println(fare);
    }

}
