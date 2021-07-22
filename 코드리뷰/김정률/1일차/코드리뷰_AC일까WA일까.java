import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        char[] arr = new char[n];
        for(int i=0;i<n;i++) {
            arr[i] = str.charAt(i);
        }
        String result = "AC";
        if(arr[0] != 'A' || arr[1] == 'C' || arr[n-1] == 'C') {
            result = "WA";
        }else {
            for(int i=1;i<n;i++) {
                if(arr[i] != 'C' && arr[i]<'a') {
                    result = "WA";
                }
            }
        }
        
        System.out.println(result);
        
    }

}