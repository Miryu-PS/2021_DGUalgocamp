/*
'A' �� 'C'�� ������ ������ �� �ֽ��ϴ�.
���� 'A'�� 'C'�� ������ �����Ѵٸ� cnt���� len-2�� �ƴ� �ٸ� ���� ���� ���� �ְ���.
c�� �ʱⰪ�� true �� �� �ξ��ٰ� �ݺ��� �������� 'A', 'C', �ҹ��ڰ� �ƴ� �ٸ� ���ڰ� ��Ÿ���ٸ� c�� false�� �ٲ��ִ� ������
3��° ������ üũ�� �� �ֽ��ϴ�.

*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int len = str.length();
        boolean a = false; // ù��° ���ڰ� A���� �Ǻ�
        boolean b = false; //C�� �ִ��� �Ǻ�
        boolean c = false; //�������� �ҹ������� �Ǻ�
        int cnt = 0;

        if (str.charAt(0)=='A')a = true;
        for(int i =2;i<len-1;i++) {
            if(str.charAt(i)=='C') b = true;
        }
        for(int i = 1;i<len;i++) {
            if(str.charAt(i)!='C' && str.charAt(i)>90)
                cnt++;
        }
        if(cnt==len-2)c=true;
        if(a&&b&&c)System.out.println("AC");
        else System.out.println("WA");
    }

}
