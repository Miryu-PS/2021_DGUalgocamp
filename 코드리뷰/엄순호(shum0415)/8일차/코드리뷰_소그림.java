import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    
    static char[][] arr;
    static boolean[][] visited;
    static boolean[][] visited2;
    static int n;
    static int dx[] = {-1, 0, 1, 0};
    static int dy[] = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException { // ¼Ò ±×¸² 
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        n = Integer.parseInt(br.readLine());
        arr = new char[n+2][n+2];
        visited = new boolean[n+2][n+2];
        visited2 = new boolean[n+2][n+2];
        
        for(int i=1; i<=n; i++) {
            String str = br.readLine();
            for(int j=1; j<=n; j++) {
                arr[i][j] = str.charAt(j-1);
            }
        }
        
        int ans = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(arr[i][j] == 'R' && visited[i][j] == false) {
                    dfs(i, j, 'R');
                    ans++;
                }
            }
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(arr[i][j] == 'G' && visited[i][j] == false) {
                    dfs(i, j, 'G');
                    ans++;
                }
            }
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(arr[i][j] == 'B' && visited[i][j] == false) {
                    dfs(i, j, 'B');
                    ans++;
                }
            }
        }
        System.out.print(ans + " ");
        
        int ans2 = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if((arr[i][j] == 'R' || arr[i][j] == 'G') && visited2[i][j] == false) {
                    dfs2(i, j, 'R', 'G');
                    ans2++;
                }
            }
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(arr[i][j] == 'B' && visited2[i][j] == false) {
                    dfsb(i, j, 'B');
                    ans2++;
                }
            }
        }
        System.out.println(ans2);

    }

    static void dfs(int x, int y, char c) {
        visited[x][y] = true;
        for(int i=0; i<4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 1 || newx > n || newy < 1 || newy > n)
                continue;
            if (visited[newx][newy] == false && arr[newx][newy] == c)
                dfs(newx, newy, c);
        }
    }
    
    static void dfsb(int x, int y, char c) {
        visited2[x][y] = true;
        for(int i=0; i<4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 1 || newx > n || newy < 1 || newy > n)
                continue;
            if (visited2[newx][newy] == false && arr[newx][newy] == c)
                dfsb(newx, newy, c);
        }
    }
    
    static void dfs2(int x, int y, char c, char c2) {
        visited2[x][y] = true;
        for(int i=0; i<4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 1 || newx > n || newy < 1 || newy > n)
                continue;
            if (visited2[newx][newy] == false && (arr[newx][newy] == c || arr[newx][newy] == c2))
                dfs2(newx, newy, c, c2);
        }
    }

}
