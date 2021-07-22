import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        boolean board[][] = new boolean[100][100];
        
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            
            for(int j = x; j < x+10; j++) {
                for(int k = y; k < y+10; k++) {
                    if(!board[j][k]) {
                        board[j][k] = true;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}