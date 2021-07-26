import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    static int point[][];
    static int n;
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        point = new int[n][2];
        
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            point[i][0] = Integer.parseInt(st.nextToken());
            point[i][1] = Integer.parseInt(st.nextToken());
        }
        int maxArea = 0;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i != j && point[i][0] == point[j][0]) {
                    
                    for(int k = 0; k < n; k++) {
                        if(i != k && j != k && point[i][1] == point[k][1]) {
                            int x = Math.abs(point[i][0] - point[k][0]);
                            int y = Math.abs(point[i][1] - point[j][1]);
                            
                            int area = x*y;
                            if(area > maxArea) {
                                maxArea = area;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(maxArea);
    }
}