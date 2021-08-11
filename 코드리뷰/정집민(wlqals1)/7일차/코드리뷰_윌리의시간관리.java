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
            int load = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {load,end});
        }
        Collections.sort(arr,new Comparator<Integer[]>() {

            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                return o2[1]-o1[1];
            }
        });
        int start = arr.get(0)[1];
        for (int i = 0; i < n; i++) {
            Integer[] temp = arr.get(i);
            if(start<temp[1]) {
                start = start-temp[0];
            }else {
                start = temp[1]-temp[0];
            }
        }
        System.out.println(start>=0?start:-1);
    }

}
