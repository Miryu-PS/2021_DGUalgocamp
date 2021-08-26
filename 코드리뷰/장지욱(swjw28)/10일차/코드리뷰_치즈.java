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
    static boolean temp_visit[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n+2][m+2];
        visit = new boolean[n+2][m+2];
        
        for(int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j < m+1; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        if(check()) {
            System.out.println(0);
            System.exit(0);
        }
        dfs(0, 0);
        int result = 0;
        
        while(true) {
            result++;
            int temp[][] = new int[n+2][m+2];
            temp_visit = new boolean[n+2][m+2];
            
            for(int i = 0; i < map.length; i++) {
                temp[i] = map[i].clone();
                temp_visit[i] = visit[i].clone();
            }
            
            
            
            for(int i = 1; i < n+1; i++) {
                for(int j = 1; j < m+1; j++) {
                    if(map[i][j] == 1) {
                        int cnt = 0;
                        
                        for(int k = 0; k < 4; k++) {
                            int ni = i + dx[k];
                            int nj = j + dy[k];
                            
                            if(map[ni][nj] != 1 && visit[ni][nj]) {
                                cnt++;
                                if(cnt >= 2) {
                                    temp[i][j] = 0;
                                    temp_dfs(i, j);
                                    break;
                                }
                            }
                        }    
                    }
                }
            }
            for(int i = 0; i < temp.length; i++) {
                map[i] = temp[i].clone();
                visit[i] = temp_visit[i].clone();
            }
            if(check()) {
                break;
            }
        }
        System.out.println(result);
    }
    static void dfs(int x, int y) {
        visit[x][y] = true;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < n+1 && ny < m+1) {
                if(map[nx][ny] == 0 && !visit[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
    static void temp_dfs(int x, int y) {
        temp_visit[x][y] = true;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < n+1 && ny < m+1) {
                if(map[nx][ny] == 0 && !temp_visit[nx][ny]) {
                    temp_dfs(nx, ny);
                }
            }
        }
    }
    static boolean check() {
        for(int i = 0; i < n+2; i++) {
            for(int j = 0; j < m+2; j++) {
                if(map[i][j] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
}