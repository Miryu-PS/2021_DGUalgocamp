import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String,Integer> hm = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i<n;i++) {
            String name = br.readLine();
            hm.put(name, hm.getOrDefault(name, 0)+1);
        }
        for (int i = 0; i < n-1; i++) {
            String name = br.readLine();
            hm.replace(name, hm.get(name)-1);
        }
        for(String name: hm.keySet()) {
            if(hm.get(name)==1) {
                System.out.println(name);
            }
        }
        
    }

}
