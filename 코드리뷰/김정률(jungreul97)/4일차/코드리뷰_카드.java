import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<Integer>();
        for(int i=1;i<=n;i++) {
            queue.offer(i);
        }
        while(queue.size() != 1) {
            queue.remove();
            queue.offer(queue.poll());
        }
        System.out.println(queue.poll());
    }

}