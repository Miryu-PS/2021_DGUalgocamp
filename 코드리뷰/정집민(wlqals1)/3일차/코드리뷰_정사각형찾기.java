import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] arr= new char[n][m];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine().toCharArray();
        }
        
        int b = n>m?m:n;
        boolean flag = false;
        while(b>0) {
            for (int i = 0; i <= arr.length-b; i++) {
                for (int j = 0; j <= arr[i].length-b; j++) {
                    if(arr[i][j]==arr[i+b-1][j]&&arr[i][j]==arr[i+b-1][j+b-1]&&arr[i][j]==arr[i][j+b-1]) {
                        flag=true;
                    }
                }
            }
            if(flag) {
                break;
            }else {
                b--;
            }
        }
        System.out.println(b*b);
        
        
    }

}
