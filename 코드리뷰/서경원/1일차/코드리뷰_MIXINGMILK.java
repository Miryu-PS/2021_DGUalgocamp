import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] a = new int[3][2];
        for(int i = 0; i < 3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // IOException �ʿ� 
            a[i][0] = Integer.parseInt(st.nextToken()); // �絿���� �뷮
            a[i][1] = Integer.parseInt(st.nextToken()); // ���� ����ִ� ������ ��
        }
        int b = 0; // ������ �� ( 0, 1, 2 )
        int c = 0; // �޴� �� ( 0, 1, 2 )
        for(int i = 0; i < 100; i++) {
            b = i % 3; // ������ ���� 0���� �����ؼ� 1�� ��
            c = (b + 1) % 3; // �޴� ���� 1���� �����ؼ� 2�� ��
            if(a[c][1] + a[b][1] <= a[c][0]) { // �޴� ��� ������ ���� ���� �޴� ���� �絿�� ũ�⺸�� �۰ų� ���� ��
                a[c][1] += a[b][1];  // �޴� �뿡 ������ ���� ������ ������.
                a[b][1] = 0; // ������ ���� ���� 0�� �ȴ�.                
            }
            else { // �޴� ��� ������ ���� ���� �޴� ���� �絿�� ũ�⺸�� ũ�ٸ�
                if(a[c][1] == a[c][0]) { // �޴� ���� ������ �� �������� �ʴ´ٸ� ����.
                    break;
                }
                else {
                    //b=1, c=2
                    a[b][1] = a[b][1] + a[c][1] - a[c][0];
                    a[c][1] = a[c][0]; // �޴� ���� ���� �޴� ���� �絿�� ũ��� ����.
                }
            }
        }
        for(int i = 0; i < 3; i++) {
            System.out.println(a[i][1]);
        }
    }
}