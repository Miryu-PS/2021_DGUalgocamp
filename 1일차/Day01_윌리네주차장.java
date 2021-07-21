
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
        
        st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int[] cars = new int[100]; // cars[i]; i <= t < i + 1�� �ð��� �����Ǿ��ִ� ���� ��
        for (int i = 0; i < 100; i++) {
        	cars[i] = 0;
        }
        
        st = new StringTokenizer(br.readLine());
        int t1 = Integer.parseInt(st.nextToken());
        int t2 = Integer.parseInt(st.nextToken());
        for (int i = t1; i < t2; i++) {
        	cars[i]++;
        }
        st = new StringTokenizer(br.readLine());
        t1 = Integer.parseInt(st.nextToken());
        t2 = Integer.parseInt(st.nextToken());
        for (int i = t1; i < t2; i++) {
        	cars[i]++;
        }
        st = new StringTokenizer(br.readLine());
        t1 = Integer.parseInt(st.nextToken());
        t2 = Integer.parseInt(st.nextToken());
        for (int i = t1; i < t2; i++) {
        	cars[i]++;
        }
        
        int ans = 0;
        //i <= t < i + 1�� �ð��� �ΰ��Ǵ� �ݾ� ���
        for (int i = 0; i < 100; i++) {
        	switch(cars[i]) {
        	case 1:
        		ans += A;
        		break;
        	case 2:
        		ans += 2 * B;
        		break;
        	case 3:
        		ans += 3 * C;
        		break;
        	}
        }
        System.out.println(ans);
    }
}