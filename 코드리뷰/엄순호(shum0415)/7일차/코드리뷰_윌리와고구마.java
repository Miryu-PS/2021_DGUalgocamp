import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws  IOException { // 윌리의 고구마 
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] { p, d });
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] p, Integer[] q) {
                return p[1].compareTo(q[1]);                   
            }
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=0; i<n; i++) {
            Integer[] temp = arr.get(i);
            int p = temp[0];
            int d = temp[1];
            if(d>pq.size()) {
                pq.offer(p);
            }
            else {
                int minw = pq.peek();
                if(p>minw) {
                    pq.poll();
                    pq.offer(p);
                }
            }
        }
        int ans = 0;
        while(!pq.isEmpty()) {
            ans += pq.poll();
        }
        System.out.println(ans);

    }

}
