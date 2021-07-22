import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    static boolean[][] cardSet = new boolean[4][13];
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String cards = br.readLine();
        boolean flag = false;
        
        
        for (int i = 0; i < cards.length()/3; i++) {
            char shape = cards.charAt(i*3);
            int shapeNumber;
            if(shape=='P') {
                shapeNumber=0;
            }else if(shape=='K') {
                shapeNumber=1;
            }else if(shape=='H') {
                shapeNumber=2;
            }else {
                shapeNumber=3;
            }
            int number = Integer.valueOf(cards.substring(i*3+1, i*3+3));
            if(!cardSet[shapeNumber][number]) {
                cardSet[shapeNumber][number]=true;
            }else {
                flag = true;
                break;
            }
        }
        
        if(flag) {
            System.out.println("GRESKA");
        }else {
            for (int i = 0; i < cardSet.length; i++) {
                int count = 0;
                for (int j = 0; j < 13; j++) {
                    if(!cardSet[i][j]) {
                        count++;
                    }
                }
                System.out.print(count + " ");
            }
        }
        

    }

}
