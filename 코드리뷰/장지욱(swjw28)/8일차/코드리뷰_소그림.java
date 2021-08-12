import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {1, -1, 0, 0};
    static int n;
    static int cow = 0;
    static int people = 0;
    static char image[][];
    static boolean visit[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        n = Integer.parseInt(br.readLine());
        image = new char[n][n];
        visit = new boolean[n][n];
        
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            for(int j = 0; j < n; j++) {
                image[i][j] = str.charAt(j);
            }
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!visit[i][j]) {
                    dfs_cow(i, j);
                    cow++;
                }
            }
        }
        reset();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(!visit[i][j]) {
                    dfs_people(i, j);
                    people++;
                }
            }
        }
        
        System.out.println(cow + " " + people);
    }
    static void dfs_cow(int x, int y) {
        visit[x][y] = true;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if(!visit[nx][ny] && image[x][y] == image[nx][ny]) {
                    dfs_cow(nx, ny);
                }
            }
        }
    }
    static void dfs_people(int x, int y) {
        visit[x][y] = true;
        
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < n && ny < n) {
                if(!visit[nx][ny]) {
                    if(image[x][y] == image[nx][ny]) {
                        dfs_people(nx, ny);
                    }
                    else if(image[x][y] == 'R' && image[nx][ny] == 'G') {
                        dfs_people(nx, ny);
                    }
                    else if(image[x][y] == 'G' && image[nx][ny] == 'R') {
                        dfs_people(nx, ny);
                    }
                }
            }
        }
    }
    static void reset() {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                visit[i][j] = false;
            }
        }
    }
}