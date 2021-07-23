/*
boolean은 참과 거짓 2개의 상태만을 다룰 때 사용하기 좋습니다.
하지만 이 문제에서는 하나의 소에 대해서 "관측되지 않음", "왼쪽", "오른쪽" 의 3가지 상태를 담아야 합니다.
int 배열로 선언해서 각각의 상태를 -1,0,1에 대응시켰으면 어땠을까 합니다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        boolean arr[][] = new boolean[11][2];

        int cnt = 0;

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int num = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());

            if(arr[num][d]) {
                continue;
            }
            if(arr[num][0]) {
                arr[num][d] = true;
                arr[num][0] = false;
                cnt++;
            }else if(arr[num][1]) {
                arr[num][d] = true;
                arr[num][1] = false;
                cnt++;
            }else {
                arr[num][d] = true;

            }
        }
        System.out.println(cnt);
    }
}
