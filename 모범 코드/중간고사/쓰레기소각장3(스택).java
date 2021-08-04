import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        long a = 0, b = 0; // 투입된 쓰레기의 총 길이, 소각되지 않은 쓰레기의 총 길이
        
        Stack<Integer> stack = new Stack<>();
        while (N-- > 0) {
        	int x = Integer.parseInt(br.readLine());
        	stack.add(x);
        	a += x;
        	
        }
        
        while (b < L) {
        	b += stack.pop();
        }
        System.out.print(a - b);
        
    }
}