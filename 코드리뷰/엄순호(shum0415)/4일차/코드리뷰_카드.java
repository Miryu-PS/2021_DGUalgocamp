import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for(int i=1; i<=n; i++) {
            queue.offer(i);
        }
        
        while(queue.size() != 1) {
            if(queue.size() == 1) {
                break;
            }
            queue.remove();
            
            if(queue.size() == 1) {
                break;
            }
            int x = queue.poll();
            queue.offer(x);
        }
        System.out.println(queue.poll());

    }

}
