import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub

        HashSet<Integer>hset = new HashSet<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++) {
            int a = Integer.parseInt(st.nextToken());
            if(!hset.contains(a)) hset.add(a);
        }
    
        int size = hset.size();
        System.out.println(size);
    }

}
