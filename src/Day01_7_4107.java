import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Day01_7_4107 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int L = 0, W = 0;
		for(int i = 1; i <= R+B; i++) { // L�� �ĺ� i
			if((R+B) % i == 0) { // i�� R+B�� ����� ��
				int j = (R+B)/i; // W�� �ĺ� j
				if((i-2) * (j-2) == B) { // i�� j�� ������ �����Ѵٸ� L,W�� i,j�� ���� ����
					L=i; W=j;
				}
			}
		}
		
		System.out.println(L + " " + W);
	}
	public static void main_(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int L = 0, W = 0;
		for(int i = 1; i * i <= R+B; i++) { // W�� �ĺ� i, ��Ʈ (R+B)�� ������� �ʰ�, ������ R+B ���϶�� �������� ��ü
			if((R+B) % i == 0) { // i�� R+B�� ����� ��
				int j = (R+B)/i; // L�� �ĺ� j
				if((i-2) * (j-2) == B) { // i�� j�� ������ �����Ѵٸ� L,W�� j,i�� ���� ����
					L=j; W=i;
				}
			}
		}
		
		System.out.println(L + " " + W);
	}
}
