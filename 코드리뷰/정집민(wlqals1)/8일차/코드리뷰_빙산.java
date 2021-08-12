import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
class main{
    static int n,m;
    static int[][] map;
    static boolean[][] chk;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        
        for(int i =0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0; j<m;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int year = 0;
        while(scan()==1){
            year++;
            melt();
        }
        System.out.print(scan()>1?year:0);
        
    }
    static int scan(){
        chk = new boolean[n][m];
        int cnt = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==0||chk[i][j]){
                    continue;
                }else{
                    cnt++;
                    dfs(i,j);
                }
            }
        }
        return cnt;
    }
    static void dfs(int x, int y){
        if(map[x][y]==0){
            return;
        }
        if(chk[x][y]){
            return;
        }
        chk[x][y] = true;
        for(int k=0;k<4;k++){
            int newx = x+dx[k];
            int newy = y+dy[k];
            if(newx<0||newx>n||newy<0||newy>m){
                continue;
            }else{
                dfs(newx,newy);
            }
        }
    }
    static void melt(){
        int[][] melt = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==0){
                    continue;
                }else{
                    int cnt=0;
                    for(int k=0;k<4;k++){
                        int newx = i+dx[k];
                        int newy = j+dy[k];
                        if(newx<0||newx>=n||newy<0||newy>=m){
                            cnt++;
                        }else{
                            if(map[newx][newy]==0){
                                cnt++;
                            }
                        }
                    }
                    melt[i][j] = cnt;
                    
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(map[i][j]==0)continue;
                map[i][j] = Math.max(map[i][j]-melt[i][j],0);
            }
        }
    }
}