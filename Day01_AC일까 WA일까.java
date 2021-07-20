
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
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
        
        String str = br.readLine();
        
        boolean flag = true;
        if (str.charAt(0) != 'A') flag = false;
        if (!(('a' <= str.charAt(1)) && (str.charAt(1) <= 'z'))) flag = false;
        
        boolean existC = false;
        for(int i = 2; i < str.length() - 1; i++) {
        	if(str.charAt(i) == 'C') existC = true;
        	else if (!(('a' <= str.charAt(i)) && (str.charAt(i) <= 'z'))) flag = false;
        }
        
        if (!(('a' <= str.charAt(str.length() - 1)) && (str.charAt(str.length() - 1) <= 'z'))) flag = false;
        
        if (flag && existC) System.out.print("AC");
        else System.out.print("WA");

        
    }
}