import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            int item = Integer.parseInt(br.readLine());
            if(item!=0) {
                stack.push(item);
            }
            else {
                stack.pop();
            }
        }
        
        int sum = 0;
        while(!stack.empty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}