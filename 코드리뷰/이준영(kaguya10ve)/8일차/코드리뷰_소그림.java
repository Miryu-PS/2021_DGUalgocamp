import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class main {
    static char arr[][];
    static boolean visited[][];
    static int N;
    static int dx[] = { -1, 0, 1, 0 };
    static int dy[] = { 0, 1, 0, -1 };

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        
        int ans=0;
        int ans2=0;
        arr = new char[N + 2][N + 2];
        visited = new boolean[N + 2][N + 2];
        
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= N; j++) {
                arr[i][j] = str.charAt(j - 1);
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 'R' && visited[i][j] == false) {
                    dfs(i, j, 'R');
                    ans++;
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 'G' && visited[i][j] == false) {
                    dfs(i, j, 'G');
                    ans++;
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 'B' && visited[i][j] == false) {
                    dfs(i, j, 'B');
                    ans++;
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if ((arr[i][j] == 'R' && visited[i][j] == true)||
                    (arr[i][j] == 'G' && visited[i][j] == true)) {
                    dfs2(i, j);
                    ans2++;
                }
            }
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (arr[i][j] == 'B' && visited[i][j] == true) {
                    dfs3(i, j);
                    ans2++;
                }
            }
        }
        
        System.out.println(ans+" "+ans2);
    }

    public static void dfs(int x, int y, char z) {
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 1 || newx > N || newy < 1 || newy > N)
                continue;
            if (visited[newx][newy] == false && arr[newx][newy] == z)
                dfs(newx, newy, z);
        }
    }
    public static void dfs2(int x, int y) {
        visited[x][y] = false;
        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 1 || newx > N || newy < 1 || newy > N)
                continue;
            if ((visited[newx][newy] == true && arr[newx][newy] == 'R')||
                (visited[newx][newy] == true && arr[newx][newy] == 'G'))
                dfs2(newx, newy);
        }
    }
    public static void dfs3(int x, int y) {
        visited[x][y] = false;
        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 1 || newx > N || newy < 1 || newy > N)
                continue;
            if ((visited[newx][newy] == true && arr[newx][newy] == 'B'))
                dfs3(newx, newy);
        }
    }

}