import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for(int i =1; i<=n; i++){
            queue.offer(i);
        }

        while(true){
            queue.poll();
            queue.offer(queue.poll());
            if(queue.size() == 1){
                System.out.println(queue.peek());
                break;
            }
        }
    }
}