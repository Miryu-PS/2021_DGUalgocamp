
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader를 사용하기 위해서는 해당 메소드에 throws IOException 구문이 필수입니다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        String str = br.readLine();
        
        boolean flag = true; // true이면 AC, false이면 WA
        if (str.charAt(0) != 'A') flag = false; // 첫 번째 문자가 A인지 확인
        if (!(('a' <= str.charAt(1)) && (str.charAt(1) <= 'z'))) flag = false; // 두 번째 문자가 소문자인지 확인
        
        boolean existC = false; // true이면 세번째 문자부터 맨 뒤 바로 앞 문자 사이에 C가 존재한다.
        
     // 세번째 문자부터 맨 뒤 바로 앞 문자 사이에 C가 아니라면 소문자인지 확인
        for(int i = 2; i < str.length() - 1; i++) {
        	if(str.charAt(i) == 'C') existC = true;
        	else if (!(('a' <= str.charAt(i)) && (str.charAt(i) <= 'z'))) flag = false; 
        }
        
        if (!(('a' <= str.charAt(str.length() - 1)) && (str.charAt(str.length() - 1) <= 'z'))) flag = false; // 마지막 문자가 소문자인지 확인
        
        if (flag && existC) System.out.print("AC");
        else System.out.print("WA");

        
    }
}