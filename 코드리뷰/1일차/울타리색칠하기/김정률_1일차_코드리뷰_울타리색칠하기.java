import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        boolean[] arr = new boolean[100];
        for(int i=0;i<100;i++) {
            arr[i] = false;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        for(int i=a;i<b;i++) {
            arr[i] = true;
        }
        for(int i=c;i<d;i++) {
            arr[i] = true;
        }
        
        int answer = 0;
        for(int i=0;i<100;i++) {
            if(arr[i]) answer++;
        }
        System.out.println(answer);
        
    }

}