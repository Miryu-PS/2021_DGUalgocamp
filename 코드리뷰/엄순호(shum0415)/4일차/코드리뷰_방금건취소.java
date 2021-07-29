import java.util.Scanner;
import java.util.Stack;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        
        int k = sc.nextInt();
        int x = 0;
        
        for(int i=0; i<k; i++) {
            x = sc.nextInt();
            if(x == 0) {
                stack.pop();
                continue;
            }
            else {
                stack.push(x);
            }
        }
        
        int sum = 0;
        while(!stack.empty()) {
            sum += stack.pop();
            if(stack.empty()) break;
        }
        
        System.out.println(sum);

    }

}
