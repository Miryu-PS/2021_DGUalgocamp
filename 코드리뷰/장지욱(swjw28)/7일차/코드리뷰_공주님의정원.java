import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> arr = new ArrayList<>();
        
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            int start_m = Integer.parseInt(st.nextToken());
            int start_d = Integer.parseInt(st.nextToken());
            int end_m = Integer.parseInt(st.nextToken());
            int end_d = Integer.parseInt(st.nextToken());
            
            arr.add(new Integer[] {start_m*100 + start_d, end_m*100 + end_d});
            
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer a[], Integer b[]) {
                if(a[0] == b[0]) {
                    return a[1] - b[1];
                }
                return a[0] - b[0];
            }
        });
        
        int end = 301;
        int max = 0;
        int cnt = 0;
        int idx = 0;
        
        while(end < 1201) {
            boolean TF = false;
            
            for(int i = idx; i < n; i++) {
                Integer temp[] = arr.get(i);
                if(temp[0] > end) {
                    break;
                }
                if(temp[0] <= end && temp[1] > max) {
                    max = temp[1];
                    idx = i+1;
                    TF = true;
                }
            }
            if(TF) {
                end = max;
                cnt++;
            }
            else {
                break;
            }
        }
        if(max < 1201) {
            System.out.println(0);
        }
        else {
            System.out.println(cnt);
        }
    }
}