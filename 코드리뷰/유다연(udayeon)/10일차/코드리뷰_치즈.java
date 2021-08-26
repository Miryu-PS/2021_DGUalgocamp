import java.io.*;
import java.util.*;

public class main {
    static int arr[][];
    static boolean visited[][];
    static int N, M;
    static int dx[] = { -1, 0, 1, 0 };
    static int dy[] = { 0, 1, 0, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N+2][M+2];
        visited = new boolean[N+2][M+2];
        
        int count = 0;
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=M; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]==1)
                    count++;
            }
        }
        
        int time = 0;
        while(true) {
            if(count==0)
                break;
            dfs(0,0);
            
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= M; j++) {
                    if (arr[i][j] == 1) {
                        int side = 0;
                        for(int k = 0; k < 4; k++) {
                            int newi = i + dx[k];
                            int newj = j + dy[k];
                            if(arr[newi][newj] == 0 && visited[newi][newj] == true)
                                side++;
                        }
                        if(side >= 2) {
                            arr[i][j] = 2;
                            count--;
                        }
                    }
                }
            }
            time++;
            for(int i=0; i<N+2; i++) {
                for(int j=0; j<M+2; j++) {
                    visited[i][j] = false;
                }
            }
            for(int i=0; i<N+2; i++) {
                for(int j=0; j<M+2; j++) {
                    if(arr[i][j]==2)
                        arr[i][j] = 0;
                }
            }
        }
        System.out.println(time);
    }

    public static void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 0 || newx > N+1 || newy < 0 || newy > M+1)
                continue;
            if (visited[newx][newy] == false && arr[newx][newy] == 0)
                dfs(newx, newy);
        }
    }

}