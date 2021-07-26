import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int b = sc.nextInt();
        int size = (r+4) / 2;
        int width = 0;
        int height = 0;

        int m = 3;
        int n = size - m;
        
        while (n >= 3 && n >= m) {
            if ((n-2) * (m-2) == b) {
                   width = n;
                height = m;
                break;
            }
            n--;
            m++;
        }
        System.out.print(width+" ");
        System.out.println(height);
    }

}