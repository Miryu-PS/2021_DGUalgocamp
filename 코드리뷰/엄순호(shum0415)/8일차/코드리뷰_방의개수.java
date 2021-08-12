import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {

    static char[][] arr;
    static boolean[][] visited;
    static int n, m;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws  IOException { // 방의 개수 
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new char[n+2][m+2];
        visited = new boolean[n+2][m+2];
        
        for(int i=1; i<=n; i++) {
            String str = br.readLine();
            for(int j=1; j<=m; j++) {
                arr[i][j] = str.charAt(j-1);
            }
        }
        
        int ans = 0;
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(arr[i][j] == '.' && visited[i][j] == false) {
                    dfs(i, j);
                    ans++;
                }
            }
        }
        System.out.println(ans);

    }

    static void dfs(int x, int y) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 1 || newx > n || newy < 1 || newy > m)
                continue;
            if (visited[newx][newy] == false && arr[newx][newy] == '.')
                dfs(newx, newy);
        }
    }

}
