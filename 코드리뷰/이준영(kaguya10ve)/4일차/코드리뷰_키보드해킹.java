import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        Stack<Character>stack = new Stack<Character>();
        Stack<Character>stack2 =new Stack<Character>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String Str=br.readLine();
        
        char[] str=Str.toCharArray();
        for(int i=0; i<Str.length(); i++) {
            if(str[i]=='<') {
                if(stack.empty()) continue;
                else {
                    stack2.push(stack.pop());
                }
            } else if(str[i]=='>') {
                if(stack2.empty()) continue;
                else {
                    stack.push(stack2.pop());
                }
            } else if(str[i]=='-') {
                if(stack.empty()) continue;
                stack.pop();
            } else {
                stack.push(str[i]);
            }
        }
        
        StringBuilder sb=new StringBuilder();        
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        
        while(!stack2.isEmpty()) {
            sb.append(stack2.pop());
        }
        System.out.println(sb.toString());
    }

}