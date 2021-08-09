import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> hset = new HashSet<>();
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(hset.contains(str)) hset.remove(str);
            else hset.add(str);
        }
        for(int i=0; i<N-1; i++) {
            String str = br.readLine();
            if(hset.contains(str)) hset.remove(str);
            else hset.add(str);
        }
        System.out.println(hset.toArray()[0]);
    }

}
