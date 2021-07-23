/*
int 대신 Integer을 사용하셔서 NULL 상태까지 이용하셨네요. NULL, 0, 1의 세 상태를 이용한 좋은 구현입니다!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer[] cows = new Integer[11];

        int crossed = 0;
        while(n-->0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cow = Integer.parseInt(st.nextToken());
            int location = Integer.parseInt(st.nextToken());
            if(cows[cow]==null) {
                cows[cow] = location;
            }else {
                if(cows[cow]!=location) {
                    crossed++;
                    cows[cow] = location;
                }
            }

        }
        System.out.println(crossed);

    }

}
