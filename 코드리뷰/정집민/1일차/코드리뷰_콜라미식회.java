import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[] scoreTable;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int bear = Integer.parseInt(st.nextToken());
        int cola = Integer.parseInt(st.nextToken());
        
        scoreTable = new int[cola+1];
        for (int i = 0; i < bear; i++) {
            st = new StringTokenizer(br.readLine());
            int goodCola = Integer.parseInt(st.nextToken());
            for (int j = 0; j < goodCola; j++) {
                int colaNumber = Integer.parseInt(st.nextToken());
                scoreTable[colaNumber]++;
            }
        }
        
        int cnt=0;
        for (int i = 0; i < scoreTable.length; i++) {
            if(scoreTable[i]==bear) {
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }

}
