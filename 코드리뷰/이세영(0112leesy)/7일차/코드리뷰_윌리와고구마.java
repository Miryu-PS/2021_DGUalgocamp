import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> arr = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {d,p});
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] p, Integer[] q) {
                return p[0].compareTo(q[0]);
            }
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++) {
            int d = arr.get(i)[0];
            int p = arr.get(i)[1];
            if(d > pq.size()) pq.offer(p);
            else if(d == pq.size()) {
                if(p > pq.peek()) {
                    pq.poll();
                    pq.offer(p);
                }
            }
        }
        
        int ans = 0;
        while(!pq.isEmpty()) ans += pq.poll();
        System.out.println(ans);
    }

}