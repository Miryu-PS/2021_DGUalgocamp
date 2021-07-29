import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int front = -1;
        int back = -1;
        int size = 0;
        int[] q = new int[10001];
        while(k-->0) {
            st = new StringTokenizer(br.readLine());
            String o = st.nextToken();
            if(o.equals("push")) {
                int e = Integer.parseInt(st.nextToken());
                q[++back] = e;
                size++;
            }else if(o.equals("front")) {
                if(size==0) {
                    sb.append(-1).append('\n');
                }else {
                    Integer e = q[front+1];
                    sb.append(e).append('\n');
                }
            }else if(o.equals("pop")) {
                if(size==0) {
                    sb.append(-1).append('\n');
                }else {
                    Integer e = q[++front];
                    sb.append(e).append('\n');
                    size--;
                }
            }else if(o.equals("back")) {
                if(size==0) {
                    sb.append(-1).append('\n');
                }else {
                    Integer e = q[back];
                    sb.append(e).append('\n');
                    
                }
            }else if(o.equals("size")) {
                sb.append(size).append('\n');
            }else if(o.equals("empty")) {
                if(size==0) {
                    sb.append(1).append('\n');
                }else {
                    sb.append(0).append('\n');
                }
            }
        }
        System.out.println(sb);
        
    }

}
