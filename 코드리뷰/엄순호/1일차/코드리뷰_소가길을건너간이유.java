import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[11];
        for(int i=0; i<11; i++) {
            arr[i] = -1;
        }
        
        int ans = 0;
        for(int i=0; i<N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(arr[x] != y && arr[x] != -1) {
                ans++;
            }
            
            arr[x] = y;
            
        }
        
        System.out.println(ans);

    }

}
