/*
'A' 와 'C'가 여러번 등장할 수 있습니다.
만약 'A'와 'C'가 여러번 등장한다면 cnt값이 len-2가 아닌 다른 값이 나올 수도 있겠죠.
c의 초기값을 true 로 해 두었다가 반복문 범위에서 'A', 'C', 소문자가 아닌 다른 문자가 나타난다면 c를 false로 바꿔주는 식으로
3번째 조건을 체크할 수 있습니다.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        boolean a = false; // 첫번째 글자가 A인지 판별
        boolean b = false; //C가 있는지 판별
        boolean c = false; //나머지가 소문자인지 판별
        int cnt = 0;

        if (str.charAt(0)=='A')a = true;
        for(int i =2;i<len-1;i++) {
            if(str.charAt(i)=='C') b = true;
        }
        for(int i = 1;i<len;i++) {
            if(str.charAt(i)!='C' && str.charAt(i)>90)
                cnt++;
        }
        if(cnt==len-2)c=true;
        if(a&&b&&c)System.out.println("AC");
        else System.out.println("WA");
    }

}
