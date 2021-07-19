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
		for(int i = 1; i <= R+B; i++) { // L의 후보 i
			if((R+B) % i == 0) { // i가 R+B의 약수일 때
				int j = (R+B)/i; // W의 후보 j
				if((i-2) * (j-2) == B) { // i와 j가 조건을 만족한다면 L,W에 i,j를 각각 저장
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
		for(int i = 1; i * i <= R+B; i++) { // W의 후보 i, 루트 (R+B)를 계산하지 않고, 제곱이 R+B 이하라는 조건으로 대체
			if((R+B) % i == 0) { // i가 R+B의 약수일 때
				int j = (R+B)/i; // L의 후보 j
				if((i-2) * (j-2) == B) { // i와 j가 조건을 만족한다면 L,W에 j,i를 각각 저장
					L=j; W=i;
				}
			}
		}
		
		System.out.println(L + " " + W);
	}
}
