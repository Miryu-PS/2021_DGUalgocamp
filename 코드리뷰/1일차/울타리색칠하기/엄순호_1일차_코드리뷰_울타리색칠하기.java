import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        boolean arr[] = new boolean[100];
        
        for(int i=0; i<100; i++) {
            arr[i] = false;
        }
        
        for(int i=a; i<b; i++) {
            arr[i] = true;
        }
        
        for(int i=c; i<d; i++) {
            arr[i] = true;
        }
        
        int ans = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == true) ans++;
        }
        
        System.out.println(ans);

    }

}
