import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<Long, Long> tm = new TreeMap<>();
        
        int n = Integer.parseInt(br.readLine());
        
        long sum = 0;
        
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            
            long x = Long.parseLong(st.nextToken());
            long a = Long.parseLong(st.nextToken());
            
            if(tm.containsKey(x)) {
                tm.replace(x, tm.get(x)+a);
            }
            else {
                tm.put(x, a);
            }
            sum += a;
        }
        
        long psum = 0;
        for(long i : tm.keySet()) {
            psum += tm.get(i);
            if(psum >= (sum + 1)/2) {
                System.out.println(i);
                break;
            }
        }
    }
}