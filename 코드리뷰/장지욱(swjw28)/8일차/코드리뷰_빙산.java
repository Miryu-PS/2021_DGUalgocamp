import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {1, -1, 0, 0};
    static int n, m;
    static int map[][];
    static boolean visit[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        visit = new boolean[n][m];
        
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int year = 0;
        
        while(true) {
            int cnt = 0;
            
            int temp[][] = new int[n][m];
            for(int i = 0; i < temp.length; i++) {
                temp[i] = map[i].clone();
            }
            
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    if(map[i][j] != 0) {
                        if(!visit[i][j]) {
                            dfs(i, j);
                            cnt++;
                        }
                        for(int k = 0; k < 4; k++) {
                            int ni = i + dx[k];
                            int nj = j + dy[k];
                            
                            if(ni >= 0 && nj >= 0 && ni < n && nj < m) {
                                if(map[ni][nj] == 0 && temp[i][j] > 0) {
                                    temp[i][j]--;
                                }
                            }
                        }
                    }
                }
            }
            if(cnt >= 2) {
                break;
            }
            for(int i = 0; i < map.length; i++) {
                map[i] = temp[i].clone();
            }
            if(check()) {
                System.out.println(0);
                System.exit(0);
                break;
            }
            year++;
            reset();
        }
        System.out.println(year);
    }
    static void dfs(int x, int y) {
        visit[x][y] = true;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if(!visit[nx][ny] && map[nx][ny] != 0) {
                    dfs(nx, ny);
                }
            }
        }
    }
    static boolean check() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(map[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    static void reset() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                visit[i][j] = false;
            }
        }
    }
}