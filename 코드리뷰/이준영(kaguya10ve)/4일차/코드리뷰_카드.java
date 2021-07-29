import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Queue<Integer>queue=new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N=Integer.parseInt(br.readLine());
        
        for(int i=1; i<=N; i++) {
            queue.offer(i);
        }
        
        while(queue.size()!=1) {
            queue.poll();
            queue.offer(queue.poll());
        }
        System.out.println(queue.peek());
    }

}