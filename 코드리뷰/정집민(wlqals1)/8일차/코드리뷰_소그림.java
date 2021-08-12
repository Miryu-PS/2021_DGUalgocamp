import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class main {
    static int n;
    static char[][] map;
    static boolean[][] chk;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new char[n][n];
        chk = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            map[i] = br.readLine().toCharArray();
        }
        int cnt =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!chk[i][j]){
                    cnt++;
                    dfs(i,j,map[i][j]);
                }
            }
        }
        int cnt2 =0;
        chk = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(map[i][j]=='G'){
                    map[i][j]='R';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(!chk[i][j]){
                    cnt2++;
                    dfs(i,j,map[i][j]);
                }
            }
        }
        System.out.println(cnt+ " "+cnt2);
        
    }
    static void dfs(int i ,int j,char c) {
        if(chk[i][j]) return;
        if(map[i][j]!=c) return;
        
        chk[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int newx = i+dx[k];
            int newy = j+dy[k];
            if(newx<0||newx>=n||newy<0||newy>=n) {
                continue;
            }
            if(chk[newx][newy]==false&&map[newx][newy]==c) {
                dfs(newx,newy,c);
            }
            
        }
    }

}
