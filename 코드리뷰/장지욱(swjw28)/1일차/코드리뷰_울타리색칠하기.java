/*
java.lang.Math 를 import 하면
min = Math.min(min, arr[i]);
max = Math.max(max, arr[i]); 과 같이도 사용 가능합니다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[4];

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;

        int min = 100;
        int max = 0;

        if(b < c || d < a) {
            System.out.println(b-a + d-c);
        }

        else {
            for(int i = 0; i < 4; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                }
                if(arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(max - min);
        }
    }
}
