import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Character> stack = new Stack<Character>();
        String str = st.nextToken();
        String answer = "";
        for (int i =0; i < str.length(); i++){
            if (str.charAt(0) != 'A'){
                answer = "WA";
                break;
            }
            else if(str.charAt(1) == 'C'){
                answer ="WA";
                break;
            }
            else if(str.charAt(str.length()-1) == 'C'){
                answer = "WA";
                break;
            }
            else {
                if(str.charAt(i) == 'C') stack.push(str.charAt(i));
                else if ((int)str.charAt(i)>=67 && (int)str.charAt(i) <= 90){
                    answer ="WA";
                    break;
                }
            }

        }
        if (stack.size() == 1 && answer != "WA"){
            answer = "AC";
        }
        System.out.println(answer);
    }
}
