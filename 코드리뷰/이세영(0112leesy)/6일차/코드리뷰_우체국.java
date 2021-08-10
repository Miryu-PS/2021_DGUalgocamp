import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> tmap = new TreeMap<>();
        
        long sum = 0, total = 0;
        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            total += a;
            if(tmap.containsKey(x)) tmap.replace(x, tmap.get(x)+a);
            else tmap.put(x, a);
        }

        for(int i : tmap.keySet()) {
            sum += tmap.get(i);
            if(sum >= (total+1)/2) {
                System.out.println(i);
                break;
            }
        }
        
    }

}
