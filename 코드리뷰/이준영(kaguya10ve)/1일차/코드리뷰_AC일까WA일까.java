/*
문자 A와 C가 어러번 등장할 수 있습니다.
else if(str.charAt(i)>='A'&&str.charAt(i)<='Z') 룰
else if(str.charAt(i)>'A'&&str.charAt(i)<='Z') 로 바꿔주어야 합니다.

*/

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int isAC=0;

        if(str.charAt(0)=='A'&&(str.charAt(1)>='a'&&str.charAt(1)<='z')) {
            for(int i=2; i<str.length()-1; i++) {
                if(str.charAt(i)=='C') {
                    isAC++;
                } else if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
                    isAC=0;
                }
            }
        }

        if(!(str.charAt(str.length()-1)>='a'&&str.charAt(str.length()-1)<='z')){
            isAC=0;
        }

        if(isAC>0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }

    }

}
