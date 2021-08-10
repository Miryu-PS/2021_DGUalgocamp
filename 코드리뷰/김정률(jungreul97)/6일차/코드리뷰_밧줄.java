import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i=0;i<n;i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        int line_count = n;
        int max_result = 0;
        for(int i=0;i<n;i++) {
            int kg = arr.get(i)*line_count;
            if(kg>max_result) max_result = kg;
            line_count--;
        }
        System.out.println(max_result);
    }

}