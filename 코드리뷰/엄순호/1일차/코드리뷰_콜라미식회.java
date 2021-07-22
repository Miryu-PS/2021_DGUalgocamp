import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[M];
        
        for(int i=0; i<N; i++) {
            int a = sc.nextInt();
            int[] brr = new int[a];
            for(int j=0; j<a; j++) {
                brr[j] = sc.nextInt();
                arr[brr[j]-1]++;
            }
        }
        int count=0;
        for(int i=0; i<M; i++) {
            if(arr[i] == N) count++;
        }
        System.out.println(count);


    }

}
