
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
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[5]; //arr[5] = {1~2�г�, 3~4 ��, 3~4��, 5~6��, 5~6��}
        for(int i = 0; i < 5; i++) {
        	arr[i] = 0;
        }
        
        while (N-- > 0) {
        	st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            
            if ((Y == 1) || (Y == 2)) arr[0]++;
            else if ((Y == 3) || (Y == 4)) {
            	if (S == 1) arr[1]++;
            	else arr[2]++;
            }
            else {
            	if (S == 1) arr[3]++;
            	else arr[4]++;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            	ans += (arr[i] + K - 1) / K; // �� �׷쿡 �ʿ��� ���� ������ ���
        }
        
        

        System.out.println(ans);
    }
}