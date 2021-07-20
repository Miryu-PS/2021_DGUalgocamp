
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
	
	public static int minimum(int a, int b) {
		if (a < b) return a;
		return b;
	}
    public static void main(String[] args) throws IOException{ // BufferedReader를 사용하기 위해서는 해당 메소드에 throws IOException 구문이 필수입니다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
//        // 입력 형태 : "N"
//        int N = Integer.parseInt(br.readLine());
//        
//        // 입력 형태 : "N1 N2" 
//        st = new StringTokenizer(br.readLine());
//        int N1 = Integer.parseInt(st.nextToken());
//        int N2 = Integer.parseInt(st.nextToken());
//        
//        // 입력 형태 : "string"
//        String str = br.readLine();
//        
//        // 입력 형태 : "string1 string2 string3"
//        st = new StringTokenizer(br.readLine());
//        String str1 = st.nextToken();
//        String str2 = st.nextToken();
//        String str3 = st.nextToken();
        
        int[] cap = new int[3];
        int[] qua = new int[3];
        for (int i = 0; i < 3; i++) {
        	st = new StringTokenizer(br.readLine());
        	cap[i] = Integer.parseInt(st.nextToken());
         	qua[i] = Integer.parseInt(st.nextToken());
        }
        
        for (int i = 0; i < 100; i++) {
        	int x = minimum(qua[i % 3] + qua[(i + 1) % 3], cap[(i + 1) % 3]);
        	qua[i % 3] = qua[i % 3] + qua[(i + 1) % 3] - x;
        	qua[(i + 1) % 3] = x;
        }
        System.out.println(Integer.toString(qua[0]) + "\n" + Integer.toString(qua[1]) + "\n" + Integer.toString(qua[2]));
    }
}