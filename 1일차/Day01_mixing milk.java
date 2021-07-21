
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
	
	public static int minimum(int a, int b) {
		if (a < b) return a;
		return b;
	}
    public static void main(String[] args) throws IOException{ // BufferedReader�� ����ϱ� ���ؼ��� �ش� �޼ҵ忡 throws IOException ������ �ʼ��Դϴ�.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int[] cap = new int[3]; // cap[i]; i + 1�� �絿���� �뷮
        int[] qua = new int[3]; // qua[i]; i + 1�� �絿�̿� ����ִ� ������ ��
        for (int i = 0; i < 3; i++) {
        	st = new StringTokenizer(br.readLine());
        	cap[i] = Integer.parseInt(st.nextToken());
         	qua[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 100; i++) {
        	int x = minimum(qua[i % 3] + qua[(i + 1) % 3], cap[(i + 1) % 3]); // i�� �絿���� ������ j�� �絿�̿� �ξ��� ��, j�� �絿�̿� �����ִ� ������ ��
        	qua[i % 3] = qua[i % 3] + qua[(i + 1) % 3] - x; // i�� �絿���� ������ j�� �絿�̿� �ξ��� ��, i�� �絿�̿� �����ִ� ������ ��
        	qua[(i + 1) % 3] = x;
        }
        System.out.println(Integer.toString(qua[0]) + "\n" + Integer.toString(qua[1]) + "\n" + Integer.toString(qua[2]));
    }
}