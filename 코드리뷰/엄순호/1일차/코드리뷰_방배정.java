import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[5];
        
        for(int i=0; i<N; i++) {
            int S = sc.nextInt();
            int Y = sc.nextInt();
            
            if(Y==1 || Y==2) {
                arr[0]++;
            }
            else if(Y==3 || Y==4) {
                if(S==0) arr[1]++;
                else if(S==1) arr[2]++;
            }
            else if(Y==5 || Y==6) {
                if(S==0) arr[3]++;
                else if(S==1) arr[4]++;
            }
        }
        
        int ans = 0;
        for(int i=0; i<5; i++) {
            if(arr[i]%k==0) {
                ans += arr[i]/k;
            }
            else ans += arr[i]/k +1;
        }
        
        System.out.println(ans);

    }

}
