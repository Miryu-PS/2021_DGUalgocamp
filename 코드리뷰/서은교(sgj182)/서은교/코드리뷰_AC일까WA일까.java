/*
index 별로 조건을 확인하는 지 확인해주셨군요. 0, 1, 2~length-2, length-1

만족해야 하는 조건이 여러개 나온다면, 주로 조건별로 검사를 진행하는 것이 가독성과 clean code 면에서 유리합니다.

if (str.charAt(0) != 'A') flag = false;  // 첫 문자가 A인지 검사하는 조건문
boolean existC = false;
for(int i=2; i<str.length()-1; i++){ // C의 존재를 확인하는 반복문
    if(str.charAt(i) == 'C') existC = true;
}
for(int i=0; i<str.length(); i++){ // 모든 문자가 A, C, 소문자 중 하나인지 확인하는 반복문
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
