import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        
        char[][] arr = new char[m][n];
        for(int i=0;i<m;i++) {
            String str = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        String str = br.readLine();
        int x = Integer.parseInt(str);
        
        char[][] x_arr = new char[x*m][x*n];
        //가로로 늘려주기 위한 임시 배열 저장소 생성
        char[][] ex_arr = new char[x*m][x*n];
        
        //가로로 x배씩 늘려 임시 배열에 저장
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<x;k++) {
                    ex_arr[i][j*x+k] = arr[i][j];
                    //System.out.print(arr[i][j]); //임시 저장소로 옮겨진지 확인
                }
            }
            //System.out.println();
        }
        
        //임시 저장소 배열을 세로로 x 배씩 늘려 결과배열에 저장
        for(int i=0;i<m;i++) {
            for(int j=0;j<n*x;j++) {
                for(int k=0;k<x;k++) {
                    x_arr[i*x+k][j] = ex_arr[i][j];
                }
            }
        }
        System.out.println();
        
        for(int i=0;i<x*m;i++) {
            for(int j=0;j<x*n;j++) {
                System.out.print(x_arr[i][j]);
            }
            System.out.println();
        }    
    }

}