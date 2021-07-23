/*
index ���� ������ Ȯ���ϴ� �� Ȯ�����ּ̱���. 0, 1, 2~length-2, length-1

�����ؾ� �ϴ� ������ ������ ���´ٸ�, �ַ� ���Ǻ��� �˻縦 �����ϴ� ���� �������� clean code �鿡�� �����մϴ�.

if (str.charAt(0) != 'A') flag = false;  // ù ���ڰ� A���� �˻��ϴ� ���ǹ�
boolean existC = false;
for(int i=2; i<str.length()-1; i++){ // C�� ���縦 Ȯ���ϴ� �ݺ���
    if(str.charAt(i) == 'C') existC = true;
}
for(int i=0; i<str.length(); i++){ // ��� ���ڰ� A, C, �ҹ��� �� �ϳ����� Ȯ���ϴ� �ݺ���
    if(str.charAt(i)!='A' && str.charAt(i)!='C' && !(('a' <= str.charAt(i)) && (str.charAt(i) <= 'z'))) {
        flag = false;
    }
}
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

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
