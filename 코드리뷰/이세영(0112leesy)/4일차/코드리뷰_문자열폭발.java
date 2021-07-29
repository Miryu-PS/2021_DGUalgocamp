import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class stack_arr{
    char[] arr;
    int top;
    
    stack_arr(int size){
        arr = new char[size];
        top = 0;
    }
    
    void push(char c) {
        arr[top++] = c;
    }
    
    String to_String() {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<top; i++) sb.append(arr[i]);
        return sb.toString();
    }
    
}

public class main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String bomb = br.readLine();
        
        while(str.contains(bomb)) {
            String replaced = str.replace(bomb, "*");
            int cnt = 0;
            for(int i=0; i<replaced.length(); i++) if(replaced.charAt(i) == '*') cnt++;
            stack_arr arr = new stack_arr(replaced.length()-cnt);
            for(int i=0; i<replaced.length(); i++) {
                char c = replaced.charAt(i);
                if(c != '*') arr.push(c);
            }
            str = arr.to_String();
        }
        if(str.isEmpty()) System.out.println("FRULA");
        else System.out.println(str);
    }

}
