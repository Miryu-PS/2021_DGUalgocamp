import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int cnt = 0;
        boolean[] array = new boolean [100];
        for(int i =0;i<100;i++) {
            array[i] = false;
        }
        for(int i = a;i<b;i++) {
            array[i] = true;
        }
        for(int i = c;i<d;i++) {
            array[i] = true;
        }
        
        for(int i =0;i<100;i++) {
            if(array[i])
                cnt++;
        }
        System.out.println(cnt);
    }

}
