import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int B=sc.nextInt();
        for(int i=3; i<=(R+B)/3; i++) {
            if((R+B)%i==0) {
                if(B==(((R+B)/i)-2)*(i-2)) {
                    System.out.println((R+B)/i+" "+i);
                    break;
                }
            }
        }
    }

}
