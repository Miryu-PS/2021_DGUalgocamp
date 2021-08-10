import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws  IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            int x = Integer.parseInt(br.readLine());
            arr.add(x);
        }
        
        Collections.sort(arr);
        
        int ans = 0;
        for(int i=0; i<n; i++) {
            if(arr.get(i)*(n-i) >= ans) {
                ans = arr.get(i)*(n-i);
            }
        }
        System.out.println(ans);

    }

}
