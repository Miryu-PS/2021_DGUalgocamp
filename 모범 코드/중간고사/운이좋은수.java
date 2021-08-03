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
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[3];
        st = new StringTokenizer(br.readLine());
        while (N-- > 0) {
        	int x = Integer.parseInt(st.nextToken());
        	arr[x % 3]++;
        }
        
        // 3의 배수의 개수, 3으로 나누었을 때 나머지가 1인 수와 2인 수를 이어서 만들 수 있는 수의 개수, 나머지 수 중 3개를 이어 만들수 있는 수를 더합니다.
        System.out.print(arr[0] + Math.min(arr[1], arr[2]) + Math.abs(arr[1] - arr[2]) / 3);
        
    }
}