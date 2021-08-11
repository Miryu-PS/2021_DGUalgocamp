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
            //일자를 받을 때, (월*100 + 일) 하여 101~1231범위의 수로 저장한다.
            int startDate = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
            int endDate = Integer.parseInt(st.nextToken()) * 100 + Integer.parseInt(st.nextToken());
            arr.add(new Integer[] { startDate, endDate });
        }
        Collections.sort(arr, new Comparator<Integer[]>() {//피는 일자 순, 지는 일자 역순 정렬

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[0] != o2[0]) {
                    return o1[0] - o2[0];
                } else {
                    return o2[1] - o1[1];
                }
            }
        });

        // start가 3월 1일 포함 이전인 꽃들 중 가장 늦게 끝나는 꽃을 찾는다.
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
        
        //첫번째 꽃의 구간을 설정한다.
        int start = arr.get(maxIdx)[0];
        int end = arr.get(maxIdx)[1];

        int last = arr.get(maxIdx)[1];
        int ans = 1;
        for (; i < arr.size();) {//모든 꽃들  탐색

            if (start <= 301 && end > 1130) //구간이 3월1일부터 1130이후라면 조건을 충족하므로 멈춤
                break;
            if (arr.get(i)[0] > end) { //탐색할 꽃이 현재까지 설정한 구간의 끝보다 늦게 피면, 중간이 비워지므로 조건 충족할 수 없음.
                ans = 0;
                break;
            }
            
            ans++;
            while (i < arr.size() && arr.get(i)[0] >= start && arr.get(i)[0] <= end) {//구간 내에 피는 꽃중, 가장 늦게 지는 꽃을 찾는다.
                if (last < arr.get(i)[1]) {
                    last = arr.get(i)[1];
                }
                i++;
            }

            end = last; //가장 늦게 지는 꽃을 선택했을 때의 구간 설정
        }

        if (start <= 301 && end > 1130) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }

}
