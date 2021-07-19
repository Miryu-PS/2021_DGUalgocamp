import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Day01_1_2188 {
	 public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int N = Integer.parseInt(br.readLine());
		 int Answer = 0;
		 for(int i = 0; i * 3 <= N; i++) { // 3개짜리 상자를 i개 골랐을 때
			 int R = N - i * 3; // 콜라 R병이 남는다.
			 if(R % 5 == 0) { // 이 R병을 5개짜리 상자로 남지 않게 전부 담을 수 있다면
				 int TotalBox = i + (R / 5); // 3개짜리 상자 i개와 5개짜리 상자 (R/5) 개로 N병의 콜라를 전부 담을 수 있다.
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
