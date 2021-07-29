import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException { // ¹®ÀÚ¿­ Æø¹ß 
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String t = br.readLine();
        
        boolean pos = true;
        while(pos) {
            if(str.contains(t)) {
                str = str.replace(t, "");
            }
            else if(str.length()>0) break;
            else if(str.length()==0) {
                pos = false;
                break;
            }
        }
        if(pos) {
            System.out.println(str);
        }
        else System.out.println("FRULA");

    }

}
