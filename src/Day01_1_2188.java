import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Day01_1_2188 {
	 public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int N = Integer.parseInt(br.readLine());
		 int Answer = 0;
		 for(int i = 0; i * 3 <= N; i++) { // 3��¥�� ���ڸ� i�� ����� ��
			 int R = N - i * 3; // �ݶ� R���� ���´�.
			 if(R % 5 == 0) { // �� R���� 5��¥�� ���ڷ� ���� �ʰ� ���� ���� �� �ִٸ�
				 int TotalBox = i + (R / 5); // 3��¥�� ���� i���� 5��¥�� ���� (R/5) ���� N���� �ݶ� ���� ���� �� �ִ�.
				 if(Answer == 0 || Answer > TotalBox) {
					 Answer = TotalBox;
				 }
			 }
		 }
		 if(Answer != 0) {
			 System.out.println(Answer);
		 }
		 
		 else {
			 System.out.println(-1);
		 }
	 }
}
