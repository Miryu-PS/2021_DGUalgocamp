import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        for(int i = 0; i < 100; i++)
            a[i] = 0;
        for(int j = 0; j < 2; j++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            for(int k = b; k < c; k++) {
                a[k] = 1;
            }
        }
        int count = 0;
        for(int i = 0; i < 100; i++)
            if(a[i] == 1)
                count++;
        System.out.println(count);
    }

}