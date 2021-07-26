import java.util.Scanner;

public class main {

    public static void main(String[] args) { //  ¹Ù´Ú µµ¹è  
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int R = sc.nextInt();
        int B = sc.nextInt();
        
        int ansL=0;
        int ansW=0;
        for(int i=3; i<R/2; i++) {
            if((R+B)%i==0) {
                int j = (R+B)/i;
                if((i-2)*(j-2) == B) {
                    ansL = i;
                    ansW = j;
                }
            }
        }
        System.out.println(ansL+" "+ansW);
    }

}
