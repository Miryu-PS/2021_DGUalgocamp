import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N=Integer.parseInt(br.readLine());
        
        ArrayList<Integer[]>arr=new ArrayList<Integer[]>();
        
        for(int i=0; i<N; i++) {
            st=new StringTokenizer(br.readLine());
            int amount=Integer.parseInt(st.nextToken());
            int time=Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {time,amount});
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[]a, Integer[]b) {
                return a[0].compareTo(b[0]);
            }
        });
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(); 
        
        for (int i = 0; i < N; i++) {
            Integer[] tmp = arr.get(i);
            int t = tmp[0], a = tmp[1];
            if (pq.size() < t) 
                pq.offer(a);
            else { 
                int mina = pq.peek();
                if (mina < a) {
                    pq.poll();
                    pq.offer(a);
                }
            }
        }
        int ans = 0;
        while (!pq.isEmpty()) {
            int x = pq.poll();
            ans += x;
        }
        System.out.println(ans);
    }

}