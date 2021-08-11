import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];
        
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return b[1] - a[1];
            }
        });
        
        int end = arr[0][1] - arr[0][0];
        
        for(int i = 1; i < n; i++) {
            if(arr[i][1] < end) {
                end = arr[i][1];
            }
            end -= arr[i][0];
        }
        if(end >= 0) {
            System.out.println(end);
        }
        else {
            System.out.println(-1);
        }
    }
}