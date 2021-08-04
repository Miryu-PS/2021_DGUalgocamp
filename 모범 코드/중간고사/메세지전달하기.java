import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) arr[i] = Integer.parseInt(br.readLine());
        
        int loopy = 0;
        for (int i = 1; i <= N; i++) {
        	boolean flag = true;
        	int x = i;
        	for (int j = 0; j < N; j++) {
        		if (arr[x] == 0) flag = false;
        		x = arr[x];
        	}
        	if (flag) loopy++;
        }
        
        System.out.print(N - loopy);
    }
}