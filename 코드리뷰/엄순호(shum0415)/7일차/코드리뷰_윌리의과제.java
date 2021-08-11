import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws  IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer[]> arr = new ArrayList<>();
        
        int maxday = 0;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int day = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] { day, score });
            if(day>maxday) {
                maxday = day;
            }
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] p, Integer[] q) {
                return p[1].compareTo(q[1]);
            }
        });
        
        int[] brr = new int[maxday];
        for(int i=0; i<maxday; i++) {
            brr[i] = 0;
        }
        for(int i=n-1; i>=0; i--) {
            Integer[] temp = arr.get(i);
            for(int j=temp[0]-1; j>=0; j--) {
                if(temp[1]>brr[j]) {
                    brr[j] = temp[1];
                    break;
                }
            }
        }
        int ans = 0;
        for(int i: brr) {
            ans += i;
        }
        System.out.println(ans);

    }

}
