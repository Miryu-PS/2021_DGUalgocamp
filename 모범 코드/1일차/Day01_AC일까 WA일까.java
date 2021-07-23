
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

        boolean existC = false; // true이면 세번째 문자부터 맨 뒤 바로 앞 문자 사이에 C가 존재한다.
        for(int i = 2; i < str.length() - 1; i++) {  // 세번째 문자부터 맨 뒤 바로 앞 문자 사이에 C가 존재하는 지 확인
        	if(str.charAt(i) == 'C') existC = true;
        }

        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c != 'A' && c != 'C' && !(c >= 'a' && c <= 'z')) flag = false;
        }

        if (flag && existC) System.out.print("AC");
        else System.out.print("WA");


    }
}
