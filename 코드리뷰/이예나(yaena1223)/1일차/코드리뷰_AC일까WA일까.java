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
