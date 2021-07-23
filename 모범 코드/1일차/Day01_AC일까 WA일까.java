
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader�� ����ϱ� ���ؼ��� �ش� �޼ҵ忡 throws IOException ������ �ʼ��Դϴ�.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();

        boolean flag = true; // true�̸� AC, false�̸� WA
        if (str.charAt(0) != 'A') flag = false; // ù ��° ���ڰ� A���� Ȯ��

        boolean existC = false; // true�̸� ����° ���ں��� �� �� �ٷ� �� ���� ���̿� C�� �����Ѵ�.
        for(int i = 2; i < str.length() - 1; i++) {  // ����° ���ں��� �� �� �ٷ� �� ���� ���̿� C�� �����ϴ� �� Ȯ��
        	if(str.charAt(i) == 'C') existC = true;
        }

        for(int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            if(c != 'A' && c != 'C' && !(c >= 'a' && c <= 'z')) flag = false;
        }

        if (flag && existC) System.out.print("AC");
        else System.out.print("WA");


    }
}
