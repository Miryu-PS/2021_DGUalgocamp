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
        ArrayList<Integer[]> arr = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {T,S});
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] p, Integer[] q) {
                return q[1]-p[1];
            }
        });
        
        int time = arr.get(0)[1] - arr.get(0)[0];
        for(int i=1; i<N; i++) {
            int t = arr.get(i)[0];
            int s = arr.get(i)[1];
            if(time <= s) {
                if(time < t) {
                    time = -1;
                    break;
                }
                time -= t;
            }
            else {
                time = s - t;
            }
        }
        System.out.println(time);
    }

}
