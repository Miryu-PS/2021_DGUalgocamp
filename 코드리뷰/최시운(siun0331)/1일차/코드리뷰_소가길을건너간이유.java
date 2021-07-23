/*
-1�� �ʱⰪ���� �ξ� ��Ÿ���� ������ ǥ���� ���� ���� ���̵���Դϴ�.
Java.util.Arrays�� import �ϸ�
int[] cow = new int[10];
Arrays.fill(cow, -1); �� ���� �迭�� -1�� �ʱ�ȭ�� �� �ֽ��ϴ�.
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] cow = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i =0; i< n ; i++){
            st = new StringTokenizer(br.readLine());
            int cownum = Integer.parseInt(st.nextToken());
            int loc = Integer.parseInt(st.nextToken());

            if (cow[cownum-1] == -1 ){
                cow[cownum-1] = loc;
            }
            else if (cow[cownum-1] != loc){
                count ++;
                cow[cownum-1] = loc;
            }
        }
        System.out.println(count);
    }
}
