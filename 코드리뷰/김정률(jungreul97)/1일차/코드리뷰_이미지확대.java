/*
�ӽ� �迭�� ����� �迭�� �̸� �����س��� ���� ���̵���� �����մϴ�.
�ٸ�, �ӽ� �迭�� �����ϴ� ���� �� ������ �ڵ带 �Ұ��帮���� �մϴ�.
for(int i = 0; i < m * x; i++){
    for(int j = 0; j < n * x; j++) {
        x_arr[i][j] = arr[i/x][j/x];
    }
}

�� �ڵ带 ���ؼ� ���� �迭�� arr[p][q]�� x_arr �迭���� [(p*x) ~ (p*x + (x-1))][(q*x) ~ (q*x + (x-1))] ������ �Ű����� �˴ϴ�.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[][] arr = new char[m][n];
        for(int i=0;i<m;i++) {
            String str = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        String str = br.readLine();
        int x = Integer.parseInt(str);

        char[][] x_arr = new char[x*m][x*n];
        //���η� �÷��ֱ� ���� �ӽ� �迭 ����� ����
        char[][] ex_arr = new char[x*m][x*n];

        //���η� x�辿 �÷� �ӽ� �迭�� ����
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<x;k++) {
                    ex_arr[i][j*x+k] = arr[i][j];
                    //System.out.print(arr[i][j]); //�ӽ� ����ҷ� �Ű����� Ȯ��
                }
            }
            //System.out.println();
        }

        //�ӽ� ����� �迭�� ���η� x �辿 �÷� ����迭�� ����
        for(int i=0;i<m;i++) {
            for(int j=0;j<n*x;j++) {
                for(int k=0;k<x;k++) {
                    x_arr[i*x+k][j] = ex_arr[i][j];
                }
            }
        }
        System.out.println();

        for(int i=0;i<x*m;i++) {
            for(int j=0;j<x*n;j++) {
                System.out.print(x_arr[i][j]);
            }
            System.out.println();
        }
    }

}
