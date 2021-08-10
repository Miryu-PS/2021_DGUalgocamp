import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            int x =Integer.parseInt(st.nextToken());
            list.add(x);
        }
        Collections.sort(list);
        int sum = 0;
        for(int i = 0; i< n; i++){
            sum += list.get(i) * (n-i);
        }
        System.out.println(sum);
    }
}
