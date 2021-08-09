import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();
        HashMap<Integer,Integer>map = new HashMap<Integer,Integer>();
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++) {
            int num = Integer.parseInt(st.nextToken());
            if(map.containsKey(num)) {
                int value = map.get(num);
                value++;
                map.replace(num, value);
            }
            else {
                map.put(num, 1);
            }
        }
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j = 0;j<m;j++) {
            int num2 = Integer.parseInt(st.nextToken());
            if(map.containsKey(num2)) {
                sb.append(map.get(num2)+" ");
            }
            else {
                sb.append(0+" ");
            }
        }
        sb.toString();
        System.out.println(sb);
        
    }

    
}
