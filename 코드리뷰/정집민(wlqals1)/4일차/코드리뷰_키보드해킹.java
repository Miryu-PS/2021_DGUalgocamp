import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();
        Stack<Character> lt = new Stack<Character>();
        Stack<Character> rt = new Stack<Character>();
        
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if(c=='-') {
                if(!lt.empty()) {
                    lt.pop();
                }
            }else if(c=='<') {
                if(!lt.empty()) {
                    rt.push(lt.pop());
                }
            }else if(c=='>') {
                if(!rt.empty()) {
                    lt.push(rt.pop());
                }
            }else {
                lt.push(c);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while(!lt.empty()) {
            sb.append(lt.pop());
        }
        sb.reverse();
        while(!rt.empty()) {
            sb.append(rt.pop());
        }
        System.out.println(sb);
    }

}
