import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        TreeSet<String> tset = new TreeSet<>();
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int count = 0;
        for(int i=0; i<(n+m); i++) {
            String str = br.readLine();
            boolean x = tset.add(str);
            if(!x) {
                count++;
            }
        }
        System.out.println(count);

    }

}
