/*
i�� 0���� 100�̸����� �ݺ��ϴ� �ݺ������� �����ϸ�
�� ������ (i%3)�� ���� ((i+1)%3)�� �絿�̷� �״� �����̶�� ������ �� �ֽ��ϴ�.
�迭�� ������ �絿�̸� �����ϰ� �� ������ �ݺ���Ű�� �ڵ尡 �� �� ����ȭ�� ���Դϴ�.
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // ����
        int bashmax = Integer.parseInt(st.nextToken());
        int bashhaving = Integer.parseInt(st.nextToken());
        //����
        st = new StringTokenizer(br.readLine());
        int lmax = Integer.parseInt(st.nextToken());
        int lhaving = Integer.parseInt(st.nextToken());
        //�е巹��
        st = new StringTokenizer(br.readLine());
        int millmax = Integer.parseInt(st.nextToken());
        int millhaving = Integer.parseInt(st.nextToken());
        for (int i =0; i<33; i++){
            lhaving += bashhaving;
            bashhaving = 0;
            if(lhaving > lmax){
                bashhaving = lhaving-lmax;
                lhaving = lmax;

            }
            millhaving += lhaving;
            lhaving = 0;
            if(millhaving > millmax){
                lhaving = millhaving-millmax;
                millhaving = millmax;

            }
            bashhaving += millhaving;
            millhaving = 0;
            if(bashhaving > bashmax){
                millhaving = bashhaving-bashmax;
                bashhaving = bashmax;

            }

        }
        lhaving += bashhaving;
        bashhaving = 0;
        if(lhaving > lmax){
            bashhaving = lhaving-lmax;
            lhaving = lmax;

        }
        System.out.println(bashhaving);
        System.out.println(lhaving);
        System.out.println(millhaving);
    }
}
