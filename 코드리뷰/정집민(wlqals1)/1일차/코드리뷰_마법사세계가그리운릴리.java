/*
startsWith, endsWith ����ؼ� �����ϼ̳׿�. ���� ã�ƺ��� �� �Լ��� ���縦 �˾ҳ׿�. ���� �ڵ� �����մϴ�.
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
