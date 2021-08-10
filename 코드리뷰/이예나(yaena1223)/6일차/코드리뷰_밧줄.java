import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;



public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>array = new ArrayList<Integer>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0;i<n;i++) {
            int num = Integer.parseInt(br.readLine());
            array.add(num);
        }
        
        Collections.sort(array);
        int max = 0;
        for(int i = n-1 ;i>=0;i--) {
            int tmp = array.get(i)*(n-i);
            if(max<tmp) max = tmp;
            
            
        }
        System.out.println(max);
    }

}

