import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int box = N;
        for(int i=0; i*5<=N; i++) {
            for(int j=0; j*3<=N; j++) {
                int total = i*5 + j*3;
                if(total==N) {
                    if(i+j<box)
                        box = i+j;
                }
            }
        }
        
        if(box==N)
            System.out.println(-1);
        else
            System.out.println(box);
    }
}