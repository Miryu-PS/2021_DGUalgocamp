/*
(int)(str.charAt(i+1))*10-480+(int)(str.charAt(i+2))-48 를 if문으로 분기되기 전에 미리 변수를 만들어서 저장해 놓으면 코드를 간소화할 수 있습니다.
이 값을 이용해서 GRESKA도 검사 가능합니다.

for(int i=0; i<str.length(); i+=3) {
    int value = (int)(str.charAt(i+1))*10-480+(int)(str.charAt(i+2))-48;
    if(str.charAt(i)=='P') {
        P[value]++;
        if(P[value] >= 2) isGRESKA = true;
    }
    ...
}
*/
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        int P[]=new int[13];
        int K[]=new int[13];
        int H[]=new int[13];
        int T[]=new int[13];

        for(int i=0; i<str.length(); i+=3) {
            if(str.charAt(i)=='P') {
                P[(int)(str.charAt(i+1))*10-480+(int)(str.charAt(i+2))-48]++;
            } else if(str.charAt(i)=='K') {
                K[(int)(str.charAt(i+1))*10-480+(int)(str.charAt(i+2))-48]++;
            } else if(str.charAt(i)=='H') {
                H[(int)(str.charAt(i+1))*10-480+(int)(str.charAt(i+2))-48]++;
            } else if(str.charAt(i)=='T') {
                T[(int)(str.charAt(i+1))*10-480+(int)(str.charAt(i+2))-48]++;
            }
        }
        int countp=13;
        int countk=13;
        int counth=13;
        int countt=13;
        int count=0;

        for(int i=0; i<13; i++) {
            if(P[i]==1) {
                countp--;
            } else if(P[i]>=2) {
                System.out.println("GRESKA");
                count++;
                break;
            }
            if(K[i]==1) {
                countk--;
            } else if(K[i]>=2) {
                System.out.println("GRESKA");
                count++;
                break;
            }
            if(H[i]==1) {
                counth--;
            } else if(H[i]>=2) {
                System.out.println("GRESKA");
                count++;
                break;
            }
            if(T[i]==1) {
                countt--;
            } else if(T[i]>=2) {
                System.out.println("GRESKA");
                count++;
                break;
            }
        }
        if(count==0) {
            System.out.println(countp+" "+countk+" "+counth+" "+countt);
        }

    }

}
