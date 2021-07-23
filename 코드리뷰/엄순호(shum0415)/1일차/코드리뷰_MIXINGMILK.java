/*
i%3 번에서 (i+1)%3 번으로 옮기는 내용 잘 구현해주셨습니다.
이렇게 구현하는 방법도 있으니 참고해주세요
import java.lang.Math;
......
int b = i%3;
int c = (i+1)%3;
int totalmilk = arr[b] + arr[c]; // 따르는 통과 받는 통의 총 우유량
arr[c] = Math.min(brr[c], totalmilk); // 받는 통에는 받는 통의 용량과 총 우유량의 최소값만큼 차게 된다.
arr[b] = totalmilk - arr[c]; // 총 우유량 - 받는 통 우유량 = 따르는 통 우유량
*/

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];
        int[] brr = new int[3];

        for(int i=0; i<3; i++) {
            brr[i] = sc.nextInt();
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<100; i++) {
            if((arr[i%3]+arr[(i+1)%3]) > brr[(i+1)%3]) {
                arr[i%3] = arr[i%3]+arr[(i+1)%3]-brr[(i+1)%3];
                arr[(i+1)%3] = brr[(i+1)%3];
            }
            else {
                arr[(i+1)%3] = arr[i%3]+arr[(i+1)%3];
                arr[i%3] = 0;
            }
        }

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }

}
