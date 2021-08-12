import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class main {
    static boolean[][] visited;
    static int N;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static char[][] human_arr;
    static char[][] cow_arr;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        visited = new boolean[N][N];
        human_arr = new char[N][N];
        cow_arr = new char[N][N];
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            for(int j=0; j<N; j++) {
                char c = str.charAt(j);
                human_arr[i][j] = c;
                if(c == 'G') c = 'R';
                cow_arr[i][j] = c;    
            }
        }
        
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j]) {
                    cnt++;
                    dfs(i,j,human_arr);
                }
            }
        }
        sb.append(cnt+" ");
        visited = new boolean[N][N];
        cnt = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<N; j++) {
                if(!visited[i][j]) {
                    cnt++;
                    dfs(i,j,cow_arr);
                }
            }
        }
        sb.append(cnt+" ");
        System.out.println(sb);
        
    }
    static void dfs(int x, int y, char[][] arr) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int new_x = x+dx[i];
            int new_y = y+dy[i];
            if(new_x < 0 || new_y >= N || new_x >= N || new_y < 0) continue;
            if(!visited[new_x][new_y] && arr[new_x][new_y]==arr[x][y]) dfs(new_x,new_y,arr);
        }
    }

}
