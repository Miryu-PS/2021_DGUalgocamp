import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int R = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        int L=0;
        int W=0;
        for(int i=3; i<(B+R)/2; i++) {
            if((B+R)%i==0) {
                int j = (B+R)/i;
                if((i-2)*(j-2)==B) {
                    if(i>j) {
                        L = i;
                        W = j;
                    }
                    else {
                        L = j;
                        W = i;
                    }
                    break;
                }
            }    
        }
        
        System.out.println(L + " " + W);
    }
}