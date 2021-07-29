import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] str = (br.readLine()).toCharArray();
        Stack<Character> stackLeft = new Stack<Character>();
        Stack<Character> stackRight = new Stack<Character>();
        
        for(int i=0; i<str.length; i++) {
            if(str[i]=='<') {
                if(stackLeft.empty())
                    continue;
                char item = stackLeft.pop();
                stackRight.push(item);
            }
            else if(str[i]=='>') {
                if(stackRight.empty())
                    continue;
                char item = stackRight.pop();
                stackLeft.push(item);
            }
            else if(str[i]=='-') {
                if(stackLeft.empty())
                    continue;
                stackLeft.pop();
            }
            else {
                stackLeft.push(str[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!stackLeft.empty()) {
            char item = stackLeft.pop();
            sb.append(item);
        }
        
        sb.reverse();
        
        while(!stackRight.empty()) {
            sb.append(stackRight.pop());
        }
        
        System.out.println(sb.toString());
    }
}
