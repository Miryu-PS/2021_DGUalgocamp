import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    static int get_num(String str) {
        if(str.charAt(1)=='0') return str.charAt(2)-'0'-1;
        else return str.charAt(2)-'0'+9;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String remain = br.readLine();
        boolean[][] total = new boolean[4][13];
        boolean has_error = false;
        for(int i=0; i<remain.length(); i+=3) {
            String card = remain.substring(i,i+3);
            char shape = card.charAt(0);
            if(shape=='P') {
                if(total[0][get_num(card)]) {
                    has_error = true;
                    break;
                }
                else total[0][get_num(card)] = true;
            }
            else if(shape=='K') {
                if(total[1][get_num(card)]) {
                    has_error = true;
                    break;
                }
                else total[1][get_num(card)] = true;
            }
            else if(shape=='H') {
                if(total[2][get_num(card)]) {
                    has_error = true;
                    break;
                }
                else total[2][get_num(card)] = true;
            }
            else if(shape=='T') {
                if(total[3][get_num(card)]) {
                    has_error = true;
                    break;
                }
                else total[3][get_num(card)] = true;
            }
        }
        if(has_error) System.out.println("GRESKA");
        else {
            int[] lost = new int[4];
            for(int i=0; i<4; i++) {
                for(int j=0; j<13; j++) {
                    if(!total[i][j]) lost[i]++;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<4; i++) {
                sb.append(lost[i]);
                sb.append(" ");
            }
            System.out.println(sb);
        }
    }

}
