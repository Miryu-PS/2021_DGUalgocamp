import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char str[] = br.readLine().toCharArray();
        Stack<Character> before_cs = new Stack<Character>();
        Stack<Character> after_cs = new Stack<Character>();
        for(int i=0; i<str.length; i++) {
            char c = str[i];
            if(c == '<') {
                if(before_cs.empty()) continue;
                after_cs.push(before_cs.pop());
            }
            else if(c == '>') {
                if(after_cs.empty()) continue;
                before_cs.push(after_cs.pop());
            }
            else if(c == '-') {
                if(before_cs.empty()) continue;
                else before_cs.pop();
            }
            else {
                before_cs.push(c);
            }
        }
        int before_size = before_cs.size();
        int after_size = after_cs.size();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<before_size; i++) {
            sb.insert(0, before_cs.pop());
        }
        for(int i=0; i<after_size; i++) {
            sb.append(after_cs.pop());
        }
        System.out.println(sb);
    }

}
