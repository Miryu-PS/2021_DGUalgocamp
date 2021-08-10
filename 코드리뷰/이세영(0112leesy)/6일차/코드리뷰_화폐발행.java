import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<N; i++) arr.add(Integer.parseInt(st.nextToken()));
        Collections.sort(arr);
        
        int sum = 0;
        if(arr.get(0)==1) {
            for(int i=0; i<N; i++) {
                sum += arr.get(i);
                if(i!=N-1 && sum+1 < arr.get(i+1)) {
                    break;
                }
            }
        }
        System.out.println(sum+1);
    }

}
