import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int point[][] = new int[n][2];
        
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int prev = Math.abs(point[1][0] - point[0][0]) + Math.abs(point[1][1] - point[0][1]);
        int sum = prev;
        int max = 0;
        int idx = 0;
        
        for(int i = 2; i < n; i++) {
            int next = Math.abs(point[i-1][0] - point[i][0]) + Math.abs(point[i-1][1] - point[i][1]);
            sum += next;
            
            int d = Math.abs(point[i][0] - point[i-2][0]) + Math.abs(point[i][1] - point[i-2][1]);
            
            if((prev + next) - d > max) {
                max = (prev + next) - d;
                idx = i-1;
            }
            prev = next;
        }
        System.out.println(sum - max);
    }
}