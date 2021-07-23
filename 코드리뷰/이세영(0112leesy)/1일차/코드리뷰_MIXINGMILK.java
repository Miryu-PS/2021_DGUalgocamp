/*
pourmilk 함수에서 옮기는 부분은 이렇게도 구현 가능합니다.
import java.lang.Math;
...
int totalmilk = Bucket[from]+Bucket[to]; // 두 양동이의 우유량의 합은 불변입니다.
Bucket[to] = Math.min(totalmilk, Vol[to]); // 옮긴 후 to 의 우유량은 totalmilk와 to의 용량의 최소값이 됩니다.
Bucket[from] = totalmilk - Bucket[to]; // 총 우유량에서 옮긴 후의 to의 우유량을 빼서 옮긴 후의 from의 우유량을 게산할 수 있습니다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[] Vol = new int[3];
    static int[] Bucket = new int[3];
    static boolean pour_milk(int from, int to) {
        if(Bucket[from]==0) return false;
        if(Bucket[to]==Vol[to]) return false;
        if(Bucket[from]+Bucket[to] <= Vol[to]) {
            Bucket[to] = Bucket[from] + Bucket[to];
            Bucket[from] = 0;
            return true;
        }
        if(Bucket[from]+Bucket[to] > Vol[to]) {
            Bucket[from] = Bucket[from] - Vol[to] + Bucket[to];
            Bucket[to] = Vol[to];
            return true;
        }
        else return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for(int i=0; i<3; i++) {
            st = new StringTokenizer(br.readLine());
            Vol[i] = Integer.parseInt(st.nextToken());
            Bucket[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<100; i++) {
            int from = i%3;
            int to = (i+1)%3;
            if(!(pour_milk(from, to))) break;
        }
        for(int i=0; i<3; i++) System.out.println(Bucket[i]);
    }

}
