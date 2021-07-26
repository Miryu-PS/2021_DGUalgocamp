import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int i = 0;  //3°³
        int j = 0;  //5°³

        int five = n/5;
        int three = 0;
        int last =  n-five*5-three*3;
        while(last != 0) {

            if(last%3 ==0) {
                three ++;
            }
            else if(five>=1) {
                five--;
            }
            else if(five == 0 && last%3 !=0) {
                three = -1;
                five = 0;
                break;

            }
            last =  n-five*5-three*3;

        }
        if(three>0) {
            System.out.println(five+(three));
        }
        else {
            System.out.println(five+three);
        }
    }

}