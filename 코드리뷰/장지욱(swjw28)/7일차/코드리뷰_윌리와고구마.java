import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        int n = Integer.parseInt(br.readLine());
        int arr[][] = new int[n][2];
        
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return a[1] - b[1];
            }
        });
        
        for(int i = 0; i < arr.length; i++) {
            if(pq.size() < arr[i][1]) {
                pq.offer(arr[i][0]);
            }
            else {
                if(pq.peek() < arr[i][0]) {
                    pq.poll();
                    pq.offer(arr[i][0]);
                }
            }
        }
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        System.out.println(sum);
    }
}