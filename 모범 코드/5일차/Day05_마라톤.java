import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder(); 
        HashMap<String,Integer>map = new HashMap<String,Integer>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i<N; i++) {
            String name = br.readLine();
            if(map.containsKey(name)) {
                map.replace(name, map.get(name)+1);
            }
            else {
                map.put(name, 1);
            }
        }
    
        for(int j = 0;j < N-1;j++) {
             String name2 = br.readLine();
             if(map.containsKey(name2)) map.replace(name2, map.get(name2)-1);
          }
          
        for(String a : map.keySet()) {
            if(map.get(a)!=0) System.out.println(a);
        }
    }

}

