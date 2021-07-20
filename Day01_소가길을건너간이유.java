
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader�� ����ϱ� ���ؼ��� �ش� �޼ҵ忡 throws IOException ������ �ʼ��Դϴ�.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
//        // �Է� ���� : "N"
//        int N = Integer.parseInt(br.readLine());
//        
//        // �Է� ���� : "N1 N2" 
//        st = new StringTokenizer(br.readLine());
//        int N1 = Integer.parseInt(st.nextToken());
//        int N2 = Integer.parseInt(st.nextToken());
//        
//        // �Է� ���� : "string"
//        String str = br.readLine();
//        
//        // �Է� ���� : "string1 string2 string3"
//        st = new StringTokenizer(br.readLine());
//        String str1 = st.nextToken();
//        String str2 = st.nextToken();
//        String str3 = st.nextToken();
        
        int N = Integer.parseInt(br.readLine());
        
        int[] loc = new int[11]; // loc[i]; i�� ���� ��ġ, -1 : ���� ��ġ�� �������� ���� ��, 0 : ���ʿ��� ������ ��, 1 : �����ʿ��� ������ ��
        for (int i = 0; i < 11; i++) {
        	loc[i] = -1;
        }
        
        int ans = 0;
        while (N-- > 0) {
        	st = new StringTokenizer(br.readLine());
            int cownum = Integer.parseInt(st.nextToken());
            int cowloc = Integer.parseInt(st.nextToken());
            // ������ ������ ��ġ�� �ٸ� ��ġ���� ������ ���, ���� �ǳ� Ƚ���� �߰�
            if ((loc[cownum] != -1) && (loc[cownum] != cowloc)) {
            	ans++;
            }
            loc[cownum] = cowloc;
        }
        System.out.println(ans);
    }
}