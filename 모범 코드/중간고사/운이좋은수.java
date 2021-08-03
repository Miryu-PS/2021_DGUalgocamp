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
        
        // 3�� ����� ����, 3���� �������� �� �������� 1�� ���� 2�� ���� �̾ ���� �� �ִ� ���� ����, ������ �� �� 3���� �̾� ����� �ִ� ���� ���մϴ�.
        System.out.print(arr[0] + Math.min(arr[1], arr[2]) + Math.abs(arr[1] - arr[2]) / 3);
        
    }
}