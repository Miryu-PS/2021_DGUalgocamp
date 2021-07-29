import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> st = new Stack<Integer>();
        int k = Integer.parseInt(br.readLine());
        while(k-->0){
            int e = Integer.parseInt(br.readLine());
            if(e!=0) {
                st.push(e);
            }else {
                st.pop();
            }
        }
        long sum = 0;
        while(!st.empty()) {
            sum += st.pop();
        }
        System.out.println(sum);
    }

}
