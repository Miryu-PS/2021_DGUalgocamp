import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            b.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(b);
        Collections.sort(a);
        int bi = 0;
        int ai = 0;
        int cnt = 0;
        while(ai<a.size()&&bi<b.size()) {
            if(a.get(ai)>b.get(bi)) {
                ai++;
                bi++;
                cnt++;
            }else{
                ai++;
            }
        }
        System.out.println(cnt);
    }
}
