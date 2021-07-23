/*
java.util.Arrays를 import하시면 Arrays.fill(array, -1) 로 배열을 -1로 가득 채울 수 있습니다.
if문과 else 문 양쪽에서 실행되는 코드는 밖으로 빼주시면 코드를 간소화 할 수 있습니다.

if(c!=-1 && c!=b) {
    cnt++;
}
array[a-1] = b;

*/
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array [] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int a,b,c=0;
        int cnt=0;
        for(int i = 0;i<num;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = array[a-1];
            if(c!=-1 && c!=b) {
                cnt++;
                array[a-1]=b;
            }
            else {
                array[a-1]=b;
            }

        }
        System.out.println(cnt);
    }

}
