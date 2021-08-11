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
       int N = Integer.parseInt(br.readLine());
       ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
       for(int i = 0; i < N; i++) {
           StringTokenizer st = new StringTokenizer(br.readLine());
           int start = Integer.parseInt(st.nextToken());
           int end = Integer.parseInt(st.nextToken());
           arr.add(new Integer[] { start, end });
       }
       Collections.sort(arr, new Comparator<Integer[]>() {
           public int compare(Integer[] p, Integer[] q) {
               return p[1].compareTo(q[1]); // 종료 시간 비교
           }
       });
       int ans = 0;
       int last = 0; // 현재 시간
       for(int i = 0; i < N; i++) {
           Integer[] temp = arr.get(i);
           if(last <= temp[0]) { // 현재 시간보다 작거나 같다면
               last = temp[1]; // 종료 시간은 현재 시간이 된다.
               ans++;
           }
       }
       System.out.println(ans);
   }
}