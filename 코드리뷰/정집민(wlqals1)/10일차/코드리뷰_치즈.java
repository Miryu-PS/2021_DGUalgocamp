import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int n, m;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = { -1, 0, 1, 0 };
    static int[] dy = { 0, -1, 0, 1 };

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int ans = 0;
        while(check()){
            visited = new boolean[n][m];
            outside();
            melt();
            ans++;
        }
        System.out.println(ans);
    }

    static void outside() {// 바깥영역 visit 체크

        dfs(0, 0);

    }

    static void dfs(int x, int y) {
        if (visited[x][y]||map[x][y]==1) {
            return;
        }
        visited[x][y] = true;
        for (int i = 0; i < 4; i++) {
            int newx = x + dx[i];
            int newy = y + dy[i];
            if (newx < 0 || newx >= n || newy < 0 || newy >= m) {
                continue;
            } else {
                if (map[newx][newy] == 0&&!visited[newx][newy]) {
                    dfs(newx, newy);
                }
            }

        }
        

    }

    static void melt() {
        int[][] melt = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1){
                    int cnt = 0;
                    for (int k = 0; k < 4; k++) {
                        int newx = i + dx[k];
                        int newy = j + dy[k];
                        if (map[newx][newy] == 0&&visited[newx][newy]) {
                            cnt++;
                        }
                    }
                    melt[i][j] = cnt;
                }

            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (melt[i][j] >= 2)
                    map[i][j] = 0;
            }
        }

    }

    static boolean check() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 1)
                    return true;
            }
        }
        return false;
    }

}
