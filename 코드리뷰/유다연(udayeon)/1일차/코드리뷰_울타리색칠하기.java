/*
두 구간이 겹치지 않을 조건 잘 작성해주셨습니다.
max와 min은 java.lang.Math 를 import 해주시면
int min = Math.min(a,c);
int max = Math.max(b,d); 와 같이 사용 가능합니다.
*/
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        int min, max;
        int sum = 0;
        if(b<c || d<a){
            sum += b-a;
            sum += d-c;
        }
        else{
            if(a<c){
            min = a;
        }
        else{
            min = c;
        }

        if(b<d){
            max = d;
        }
        else{
            max = b;
        }
            sum = max-min;
        }

        System.out.print(sum);

        scanner.close();
    }
}
