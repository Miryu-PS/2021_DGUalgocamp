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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer[]> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int p = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] { d, p });
        }
        Collections.sort(arr, new Comparator<Integer[]>() {

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o1[0] - o2[0];
            }
        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            Integer[] temp = arr.get(i);
            if(pq.size()<temp[0]) {
                pq.offer(temp[1]);
            }else {
                if(pq.peek()<temp[1]) {
                    pq.poll();
                    pq.offer(temp[1]);
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
