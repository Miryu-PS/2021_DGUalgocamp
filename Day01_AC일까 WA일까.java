
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
        if (!(('a' <= str.charAt(1)) && (str.charAt(1) <= 'z'))) flag = false; // �� ��° ���ڰ� �ҹ������� Ȯ��
        
        boolean existC = false; // true�̸� ����° ���ں��� �� �� �ٷ� �� ���� ���̿� C�� �����Ѵ�.
        
     // ����° ���ں��� �� �� �ٷ� �� ���� ���̿� C�� �ƴ϶�� �ҹ������� Ȯ��
        for(int i = 2; i < str.length() - 1; i++) {
        	if(str.charAt(i) == 'C') existC = true;
        	else if (!(('a' <= str.charAt(i)) && (str.charAt(i) <= 'z'))) flag = false; 
        }
        
        if (!(('a' <= str.charAt(str.length() - 1)) && (str.charAt(str.length() - 1) <= 'z'))) flag = false; // ������ ���ڰ� �ҹ������� Ȯ��
        
        if (flag && existC) System.out.print("AC");
        else System.out.print("WA");

        
    }
}