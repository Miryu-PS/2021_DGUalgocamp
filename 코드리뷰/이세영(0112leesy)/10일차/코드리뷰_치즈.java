import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,-1,0,1};
    static int n,m;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][m];
        visited = new boolean[n][m];
        int cheese = 0;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<m; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num==1) cheese++;
                arr[i][j] = num;
            }
        }

        int ans = 0;
        while(cheese > 0) {
            ans++;
            visited = new boolean[n][m];
            dfs(0,0);
            for(int i=0; i<n; i++) {
                for(int j=0; j<m; j++) {
                    if(arr[i][j] == 1) {
                        int cnt = 0;
                        for(int k=0; k<4; k++) {
                            int new_i = i+dx[k];
                            int new_j = j+dy[k];
                            if(arr[new_i][new_j] == 0 && visited[new_i][new_j]) cnt++;
                        }
                        if(cnt >= 2) {
                            arr[i][j] = -1;
                            cheese--;
                        }
                    }
                }
            }
            
            for(int i=0; i<n;i++) {
                for(int j=0; j<m; j++) {
                    if(arr[i][j] == -1) {
                        arr[i][j] = 0;
                    }
                }
            }            
        }
        System.out.println(ans);
    }
    
    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int new_x = x+dx[i];
            int new_y = y+dy[i];
            if(new_x<0 || new_y<0 || new_x>=n || new_y>=m) continue;
            if(!visited[new_x][new_y] && arr[new_x][new_y]==0) {
                dfs(new_x, new_y);
            }
        }
    }

}
