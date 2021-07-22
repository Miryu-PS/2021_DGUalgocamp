import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        boolean TF = true;
        boolean C = false;
        boolean small = true;
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(0) != 'A') {
                TF = false;
                break;
            }
            if(i >= 2 && i < str.length()-1) {
                if(str.charAt(i) == 'C') {
                    C = true;
                }
            }
            if(str.charAt(i) != 'A' && str.charAt(i) != 'C') {
                if(str.charAt(i) < 'a' || str.charAt(i) > 'z') {
                    small = false;
                    break;
                }
            }
        }
        if(TF == true && C == true && small == true) {
            System.out.println("AC");
        }else {
            System.out.println("WA");
        }
    }
}