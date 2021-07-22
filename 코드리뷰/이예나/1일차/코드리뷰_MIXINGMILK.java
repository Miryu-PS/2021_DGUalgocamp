import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(); int f = sc.nextInt();
        int second = sc.nextInt();int s = sc.nextInt();
        int third = sc.nextInt(); int t = sc.nextInt();
        int empty ;
        for(int i =0;i<100;i++) {
            if(i%3==0) {
                empty = second-s;
                if(f<empty) {
                    s=s+f;
                    f=0;
                }
                else {
                    s = s+empty;
                    f = f-empty;
                    
                }
            }
            
            else if(i%3==1) {
                empty = third-t;
                if(s<empty) {
                    t=t+s;
                    s=0;
                }
                else {
                    t = t+empty;
                    s = s-empty;
                }
            }
            else {
                empty = first-f;
                if(t<empty) {
                    f=f+t;
                    t=0;
                }
                else {
                    f = f+empty;
                    t = t-empty;
                }
            }
            
        }
        System.out.println(f);
        System.out.println(s);
        System.out.println(t);
    }

}
