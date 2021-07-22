import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int P = 13;
        int K = 13;
        int H = 13;
        int T = 13;
        
        int deck[][] = new int[4][13];
        
        String str = br.readLine();
        for(int i = 0; i < str.length(); i+=3) {
            char ch = str.charAt(i);
            int num = Integer.parseInt(str.substring(i+1, i+3));
            
            if(ch == 'P') {
                deck[0][num]++;
                P--;
            }else if(ch == 'K') {
                deck[1][num]++;
                K--;
            }else if(ch == 'H') {
                deck[2][num]++;
                H--;
            }else {
                deck[3][num]++;
                T--;
            }
            
            for(int j = 0; j < 4; j++) {
                if(deck[j][num] > 1) {
                    System.out.println("GRESKA");
                    System.exit(0);
                }
            }
        }
        System.out.println(P + " " + K + " " + H + " " + T);
    }
}