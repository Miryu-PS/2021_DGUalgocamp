import java.io.*;
import java.util.*;

public class main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        
        ArrayList<Integer[]> arr = new ArrayList<Integer[]>();
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int deadLine = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {deadLine, score});
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[] p, Integer[] q) {
                return q[1].compareTo(p[1]);
            }
        });
        
        int max = 0;
        for(int i=0; i<N; i++) {
            Integer [] tmp = arr.get(i);
            if(max < tmp[0])
                max = tmp[0];
        }
        
        int [] able = new int [max];
        int sum = 0;
        for(int i=0; i<N; i++) {
            Integer [] tmp = arr.get(i);
            for(int j=tmp[0]-1; j>=0; j--) {
                if(able[j] == 0) {
                    able[j] = tmp[1];
                    sum += tmp[1];
                    break;
                }        
            }
        }
        System.out.println(sum);
    }
}