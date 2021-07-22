import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        int time[] = new int[101];
        
        for(int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            
            for(int j = start; j < end; j++) {
                time[j]++;
            }
        }
        int result = 0;
        
        for(int i = 1; i <= 100; i++) {
            if(time[i] == 1) {
                result += a;
            }
            else if(time[i] == 2) {
                result += b*2;
            }
            else if(time[i] == 3) {
                result += c*3;
            }
        }
        System.out.println(result);
    }
}