import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack1 = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();
        
        String str = br.readLine();
        
        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if(c == '-') {
                if(stack1.empty()) {
                    continue;
                }
                stack1.pop();
            }
            else if(c == '<') {
                if(stack1.empty()) {
                    continue;
                }
                char x = stack1.pop();
                stack2.push(x);
            }
            else if(c == '>') {
                if(stack2.empty()) {
                    continue;
                }
                char x = stack2.pop();
                stack1.push(x);
            }
            else {
                stack1.push(c);
            }
        }
        while(!stack1.empty()) {
            sb.append(stack1.pop());
        }
        sb.reverse();
        while(!stack2.empty()) {
            sb.append(stack2.pop());
        }
        System.out.print(sb.toString());

    }

}
