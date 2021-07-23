/*
pour 함수에서 붓는 과정을 다음과 같이 구현할 수도 있습니다.
import java.lang.Math;
...
int totalmilk = from[1]+to[1];
to[1] = Math.min(totalmilk, to[0]);
from[1] = totalmilk - to[1];
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[][] bucket = new int[3][2];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            bucket[i][0] = Integer.parseInt(st.nextToken());
            bucket[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 100; i++) {
            pour(bucket[i%3],bucket[(i+1)%3]);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(bucket[0][1]).append('\n');
        sb.append(bucket[1][1]).append('\n');
        sb.append(bucket[2][1]).append('\n');
        System.out.println(sb);
    }

    static void pour(int[] from, int[] to) {
        boolean flooded = false;
        if(from[1]+to[1]>to[0]) {
            flooded = true;
        }
        int toMilk = flooded?to[0]:from[1]+to[1];
        from[1] = flooded?from[1]+to[1]-to[0]:0;
        to[1] = toMilk;

    }

}
