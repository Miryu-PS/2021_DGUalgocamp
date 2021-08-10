import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        char[] number = br.readLine().toCharArray();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        for (i = 0; i < n; i++) {
            if (stack.isEmpty()) {
                stack.push(number[i]);
            } else {
                while (k>0&&(!stack.isEmpty()) && (stack.peek() < number[i])) {
                    stack.pop();
                    k--;
                }
                stack.push(number[i]);
            }
        }
        while(k>0) {
            stack.pop();
            k--;
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        System.out.println(sb);

    }

}
