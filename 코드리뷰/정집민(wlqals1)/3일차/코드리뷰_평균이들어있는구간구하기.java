import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int answer = n ; //�ڱ��ڽŸ� �ִ� ������ ������ ���ԵǹǷ�, �̸� �信 ���Ѵ�
        for (int i = 0; i < n; i++) {//������
            int sum = arr[i];
            for (int j = i+1; j < n; j++) {//����..i<j������ ���Ѵ�
                sum = sum +arr[j];
                if(sum%(j-i+1)!=0)continue;
                int avg = sum/(j-i+1);
                for (int k = i; k <= j; k++) {
                    if(arr[k]==avg) {
                        answer++;
                        break;
                    }
                }
                
            }
            
        }
        
        System.out.println(answer);
        
        
    }

}
