import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();
        
        String str = br.readLine();
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '<') {
                if(!left.isEmpty()) {
                    right.push(left.pop());
                }
            }
            else if(str.charAt(i) == '>') {
                if(!right.isEmpty()) {
                    left.push(right.pop());
                }
            }
            else if(str.charAt(i) == '-') {
                if(!left.isEmpty()) {
                    left.pop();
                }
            }
            else {
                left.push(str.charAt(i));
            }
        }
        while(!left.isEmpty()) {
            right.push(left.pop());
        }
        while(!right.isEmpty()) {
            System.out.print(right.pop());
        }
    }
}