import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer[]> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            //���ڸ� ���� ��, (��*100 + ��) �Ͽ� 101~1231������ ���� �����Ѵ�.
            int startDate = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
            int endDate = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
            arr.add(new Integer[] { startDate, endDate });
        }
        Collections.sort(arr, new Comparator<Integer[]>() {//�Ǵ� ���� ��, ���� ���� ���� ����

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        // start�� 3�� 1�� ���� ������ �ɵ� �� ���� �ʰ� ������ ���� ã�´�.
        int i = 0;
        int max = 0;
        int maxIdx = 0;
        while (arr.get(i)[0]<=301) {
            if(max<arr.get(i)[1]) {
                max = arr.get(i)[1];
                maxIdx=i;
            }
            i++;
        }
        
        //ù��° ���� ������ �����Ѵ�.
        int start = arr.get(maxIdx)[0];
        int end = arr.get(maxIdx)[1];

        int last = arr.get(maxIdx)[1];
        int ans = 1;
        for (; i < arr.size();) {//��� �ɵ�  Ž��

            if (start <= 301 && end > 1130) //������ 3��1�Ϻ��� 1130���Ķ�� ������ �����ϹǷ� ����
                break;
            if (arr.get(i)[0] > end) { //Ž���� ���� ������� ������ ������ ������ �ʰ� �Ǹ�, �߰��� ������Ƿ� ���� ������ �� ����.
                ans = 0;
                break;
            }
            
            ans++;
            while (i < arr.size() && arr.get(i)[0] >= start && arr.get(i)[0] <= end) {//���� ���� �Ǵ� ����, ���� �ʰ� ���� ���� ã�´�.
                if (last < arr.get(i)[1]) {
                    last = arr.get(i)[1];
                }
                i++;
            }

            end = last; //���� �ʰ� ���� ���� �������� ���� ���� ����
        }

        if (start <= 301 && end > 1130) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }

}
