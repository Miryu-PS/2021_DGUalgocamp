import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String name = br.readLine();
        
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            
            for(int j = 0; j <= str.length()-name.length(); j++) {
                int d = 1;
                boolean TF = false;
                
                while(true) {
                    int idx = 0;
                    for(int k = j; k < str.length(); k += d) {
                        if(str.charAt(k) != name.charAt(idx)) {
                            break;
                        }
                        else if(str.charAt(k) == name.charAt(idx)) {
                            idx++;
                        }
                        if(idx == name.length()) {
                            TF = true;
                            cnt++;
                            break;
                        }
                    }
                    if(TF) {
                        break;
                    }
                    d++;
                    if(str.length()-1 < j + d*(name.length()-1)) {
                        break;
                    }
                }
                if(TF) {
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}