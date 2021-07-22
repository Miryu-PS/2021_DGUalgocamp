import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[111][111];
        for (int i = 1; i <= N; i++) {
            String str = br.readLine();
            for (int j = 1; j <= M; j++) {
                arr[i][j] = str.charAt(j - 1);
            }
        }

        int k = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) { // i��° ����
            for (int I = 1; I <= k; I++) { // k�� �ݺ��Ѵ�.
                for (int j = 1; j <= M; j++) {// i��° ���� j��° ���ڸ�
                    for (int J = 1; J <= k; J++) { // k�� �ݺ��Ͽ� ����Ѵ�.
                        sb.append(arr[i][j]);
                    }
                }
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());

    }

}
