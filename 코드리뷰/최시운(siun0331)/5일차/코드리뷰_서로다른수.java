import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        TreeSet<Integer> ts = new TreeSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(st.nextToken());

            if (! ts.contains(x)){
                ts.add(x);
            }
            else{
                continue;
            }
        }
        sb.append(ts.size());
        System.out.println(sb);
    }
}
