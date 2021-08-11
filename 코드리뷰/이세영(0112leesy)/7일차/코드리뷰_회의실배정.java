import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {start, end});
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] p, Integer[] q) {
                return p[1].compareTo(q[1]);
            }
        });
        
        int ans = 0;
        int last = 0;
        for(int i=0; i<N; i++) {
            Integer[] tmp = arr.get(i);
            if(last <= tmp[0]) {
                last = tmp[1];
                ans++;
            }
        }
        System.out.println(ans);
    }

}