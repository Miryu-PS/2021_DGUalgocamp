import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        String num = br.readLine();
        int arr[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = num.charAt(i) - '0';
        }
        
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            while(!stack.isEmpty() && cnt < k && stack.peek() < arr[i]) {
                stack.pop();
                cnt++;
            }
            stack.add(arr[i]);
        }
        for(int i = 0; i < n-k; i++) {
            sb.append(stack.get(i));
        }
        System.out.println(sb);
    }
}