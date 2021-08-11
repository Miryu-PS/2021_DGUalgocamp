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
               return p[1].compareTo(q[1]); // ���� �ð� ��
           }
       });
       int ans = 0;
       int last = 0; // ���� �ð�
       for(int i = 0; i < N; i++) {
           Integer[] temp = arr.get(i);
           if(last <= temp[0]) { // ���� �ð����� �۰ų� ���ٸ�
               last = temp[1]; // ���� �ð��� ���� �ð��� �ȴ�.
               ans++;
           }
       }
       System.out.println(ans);
   }
}