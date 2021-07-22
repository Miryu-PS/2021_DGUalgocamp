import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        char answer = 'o';
        int p=13, k =13, h = 13, t = 13;
        for(int i = 0; i<str.length(); i +=3 ){
            if (list.contains(str.substring(i,i+3))){
                answer = 'x';
                break;
            }
            else{
                list.add(str.substring(i,i+3));
                switch (str.charAt(i)){
                    case 'P':
                        p--;
                        break;
                    case 'K':
                        k--;
                        break;
                    case 'H':
                        h--;
                        break;
                    case 'T':
                        t--;
                        break;

                }
            }

        }
        if(answer == 'o') System.out.println(p+" "+k+" "+h+" "+t);
        else System.out.println("GRESKA");


    }
}