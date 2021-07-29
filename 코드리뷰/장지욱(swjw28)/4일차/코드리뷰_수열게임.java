import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int idx = 0;
        int num = 1;
        
        while(num <= n) {
            stack.push(num);
            sb.append("+\n");
            num++;
            
            while(!stack.isEmpty()) {
                if(stack.peek() == arr[idx]) {
                    stack.pop();
                    sb.append("-\n");
                    idx++;
                }
                else {
                    break;
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println(sb);
        }
        else {
            System.out.println("NO");
        }
    }
}