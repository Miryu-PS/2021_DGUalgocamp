import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        int usage = 0;
        long ans = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        while (N-- > 0) {
        	int trash = Integer.parseInt(br.readLine());
        	queue.add(trash);
        	usage += trash;
        	// 쓰레기가 모두 밖으로 밀렸다면 소각합니다.
        	while (usage - queue.peek() >= L) {
        		int x = queue.remove();
        		usage -= x;
        		ans += x;
        	}
        }
        
        System.out.print(ans);
        
    }
}