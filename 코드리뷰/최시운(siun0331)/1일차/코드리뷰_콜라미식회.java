import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = 0;
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        for (int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            for (int j = 0; j<k; j++){
                int coca = Integer.parseInt(st.nextToken());
                arr[coca-1] ++;
            }
        }
        for (int i =0; i<m; i++){
            if(arr[i] == n){
                count ++;
            }
        }
        System.out.println(count);

    }
}
