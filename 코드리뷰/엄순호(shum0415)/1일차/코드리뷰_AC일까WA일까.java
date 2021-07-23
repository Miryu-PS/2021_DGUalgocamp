/*
contains 함수와 replace 함수 이용해서 잘 해결해주셨습니다!
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        if (word.length() < 4) {
            System.out.println("WA");
        } else if (word.charAt(0) == 'A' && word.substring(2, word.length() - 1).contains("C")) {
            word = word.replace('A', 'a');
            word = word.replace('C', 'c');
            boolean flag = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("WA");
            } else {
                System.out.println("AC");
            }
        } else {
            System.out.println("WA");
        }
    }

}
