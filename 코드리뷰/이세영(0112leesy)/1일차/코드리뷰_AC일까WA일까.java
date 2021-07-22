import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    static boolean isAC(String str) {
        boolean check = false;
        if(str.charAt(0)!='A') return false;
        for(int i=0; i<str.length(); i++){
            if(!(str.charAt(i)=='A' || str.charAt(i)=='C') && str.charAt(i)-'a'<0) return false;
            if(str.charAt(i)=='C' && (i>=2 && i<str.length()-1)) check = true;
        }
        return (check)? true:false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        if(isAC(word)) System.out.println("AC");
        else System.out.println("WA");
    }

}
