import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()); // ���� Ƚ��
        int count = 0; // �ҵ��� ��ġ�� �޶����� ������ 1�� ���Ѵ�.
        int b[] = new int[10]; // �� �ҵ��� ��ġ
        int bnext[] = new int[10]; // �� �ҵ��� ���� ��ġ
        for(int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int e = Integer.parseInt(st.nextToken()); // ���� ��ȣ
            int f = Integer.parseInt(st.nextToken()); // ���� ��ġ
            if(b[e-1] == 0) { // �ҵ��� ��ġ�� ó�� ��ġ���
                b[e-1] = f+1; // 0�� �ƴ� 1�� ���� ���� �ҵ��� ��ġ�� ����
            }
            bnext[e-1] = f+1; // ó�� ��ġ�� �ƴ϶�� ���� ��ġ�� bnext�� ����
            if(bnext[e-1] != b[e-1]) // �ҵ��� ��ġ�� ó�� ��ġ�� �ƴ϶��
                count++;
                b[e-1] = bnext[e-1];            
        }
        System.out.println(count);
    }
}