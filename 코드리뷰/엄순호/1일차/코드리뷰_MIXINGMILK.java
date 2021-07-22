import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[3];
        int[] brr = new int[3];
        
        for(int i=0; i<3; i++) {
            brr[i] = sc.nextInt();
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<100; i++) {
            if((arr[i%3]+arr[(i+1)%3]) > brr[(i+1)%3]) {
                arr[i%3] = arr[i%3]+arr[(i+1)%3]-brr[(i+1)%3];
                arr[(i+1)%3] = brr[(i+1)%3];
            }
            else {
                arr[(i+1)%3] = arr[i%3]+arr[(i+1)%3];
                arr[i%3] = 0;
            }
        }
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }

}
