import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws  IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        
        stack.push(0);
        
        int j=1;
        boolean pos = true;
        for(int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());
            while(pos) {
                if(stack.peek()<x) {
                    stack.push(j);
                    j++;
                    sb.append("+\n");
                }
                else if(stack.peek() == x) {
                    stack.pop();
                    sb.append("-\n");
                    break;
                }
                else {
                    pos = false;
                    break;
                }
            }
        }
        if(pos) {
            if(stack.size() == 1) {
                System.out.println(sb.toString());
            }
            else System.out.println("NO");
        }
        else System.out.println("NO");


    }

}
