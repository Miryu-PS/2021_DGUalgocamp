import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class main {
    
    public static void main(String[] args)throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(0);
        int n = Integer.parseInt(br.readLine());
        int j = 1;
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            //스택의 머리 숫자가 k보다 작으면 k까지 하나씩 추가
            if(stack.peek()<k) {
                for(;j<=k;j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                stack.pop();
                sb.append("-").append("\n");
            }else if(stack.peek()==k) {//같으면 pop
                stack.pop();
                sb.append("-").append("\n");
            }
        }
        if(stack.size()==1) {
            System.out.println(sb);
        }else {
            System.out.println("NO");
        }
    }

}