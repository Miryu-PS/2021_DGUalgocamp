/*
if(str.charAt(0) != 'A') 조건은 반복문 안에서 검사하지 않아도 됩니다!
'A'와 'C'가 여러번 등장할 경우까지 고려한
if(str.charAt(i) != 'A' && str.charAt(i) != 'C') 조건 구현 잘 해주셨습니다.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        boolean TF = true;
        boolean C = false;
        boolean small = true;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(0) != 'A') {
                TF = false;
                break;
            }
            if(i >= 2 && i < str.length()-1) {
                if(str.charAt(i) == 'C') {
                    C = true;
                }
            }
            if(str.charAt(i) != 'A' && str.charAt(i) != 'C') {
                if(str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                    small = false;
                    break;
                }
            }
        }
        if(TF == true && C == true && small == true) {
            System.out.println("AC");
        }else {
            System.out.println("WA");
        }
    }
}
