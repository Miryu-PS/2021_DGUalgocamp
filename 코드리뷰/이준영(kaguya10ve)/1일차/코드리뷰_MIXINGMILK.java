import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int bottle[] = new int[3];
        int milk[]= new int[3];
        for(int i=0; i<3; i++) {
            bottle[i]=sc.nextInt();
            milk[i]=sc.nextInt();
        }
        
        for(int i=0; i<100; i++) {
            if(bottle[(i+1)%3]>=milk[i%3]+milk[(i+1)%3]) {
                milk[(i+1)%3]=milk[i%3]+milk[(i+1)%3];
                milk[i%3]=0;
            } else {
                milk[i%3]-=bottle[(i+1)%3]-milk[(i+1)%3];
                milk[(i+1)%3]=bottle[(i+1)%3];
            }
        }
        System.out.println(milk[0]);
        System.out.println(milk[1]);
        System.out.println(milk[2]);
    }
}
