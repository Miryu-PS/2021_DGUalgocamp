/*
startsWith, endsWith 사용해서 구현하셨네요. 저도 찾아보고 이 함수의 존재를 알았네요. 좋은 코드 감사합니다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();

        int tc = Integer.parseInt(br.readLine());
        String patternInput = br.readLine();
        String[] pattern = patternInput.split("\\*");
        int patternLength = patternInput.length()-1;
        while(tc-->0) {
            String word = br.readLine();
            if(patternLength<=word.length()&&word.startsWith(pattern[0])&&word.endsWith(pattern[1])) {
                sb.append("DA").append('\n');
            }else {
                sb.append("NE").append('\n');
            }
        }
        System.out.println(sb);
    }

}
