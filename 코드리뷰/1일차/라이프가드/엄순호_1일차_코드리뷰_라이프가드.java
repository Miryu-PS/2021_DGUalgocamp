import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1000];
        
        int N = sc.nextInt();
        int[][] brr = new int[N][2];
        
        for(int i=0; i<N; i++) {
            brr[i][0] = sc.nextInt();
            brr[i][1] = sc.nextInt();
        }
        
        int ans = 0;
        int safetime = 0;
        
        for(int i=0; i<N; i++) {
            for(int j=brr[i][0]; j<brr[i][1]; j++) {
                arr[j]++;
            }
        }
        
        for(int i=0; i<N; i++) {
            for(int j=brr[i][0]; j<brr[i][1]; j++) {
                arr[j]--;
            }
            
            for(int j=0; j<1000; j++) {
                if(arr[j] != 0) safetime++;
            }
            
            if(ans<safetime) ans = safetime;
            
            for(int j=brr[i][0]; j<brr[i][1]; j++) {
                arr[j]++;
            }
            safetime = 0;
        }
        
        
        System.out.println(ans);

    }

}
