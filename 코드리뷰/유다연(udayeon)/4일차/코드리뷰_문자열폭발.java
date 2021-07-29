import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char [] bomb = (br.readLine()).toCharArray();
        char last = bomb[bomb.length-1];
        char [] stack = new char [1000001];
        
        int stackIdx = -1;
        for(int i=0; i<str.length(); i++) {
            char tmp = str.charAt(i);
            if(tmp == last && stackIdx >= bomb.length-2) {
                Boolean pos = true;
                for(int j=1; j<bomb.length; j++) {
                    if(bomb[bomb.length-1-j] != stack[stackIdx+1-j]) {
                        pos = false;
                    }
                }
                if(pos==true) {
                    stackIdx -= (bomb.length - 1);
                }
                else {
                    stackIdx++;
                    stack[stackIdx] = tmp;
                }
            }
            else {
                stackIdx++;
                stack[stackIdx] = tmp;
            }
        }
        if(stackIdx==-1) {
            System.out.println("FRULA");
        }
        else {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<stackIdx+1; i++) {
                sb.append(stack[i]);
            }
            System.out.println(sb.toString());
        }
    }
}