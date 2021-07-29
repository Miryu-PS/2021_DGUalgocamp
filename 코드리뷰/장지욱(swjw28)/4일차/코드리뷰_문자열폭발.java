import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        
        String str = br.readLine();
        String ex = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
            
            if(stack.size() >= ex.length()) {
                boolean TF = true;
                
                for(int j = 0; j < ex.length(); j++) {
                    char ch1 = stack.get(stack.size() - ex.length() + j);
                    char ch2 = ex.charAt(j);
                    
                    if(ch1 != ch2) {
                        TF = false;
                        break;
                    }
                }
                if(TF) {
                    for(int j = 0; j < ex.length(); j++) {
                        stack.pop();
                    }
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println("FRULA");
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(char ch : stack) {
                sb.append(ch);
            }
            System.out.println(sb);
        }
    }
}