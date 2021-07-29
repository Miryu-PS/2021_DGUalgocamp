import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {
    public static void main(String args[]) throws IOException {
        Stack<Character> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                stack.push(ch);
            }
            else{
                if(!stack.empty() && stack.peek() == '(') stack.pop();
                else stack.push(ch);
            }
        }
        if(stack.empty()) sb.append(":)");
        else sb.append(":(");

        System.out.println(sb);
    }
}
