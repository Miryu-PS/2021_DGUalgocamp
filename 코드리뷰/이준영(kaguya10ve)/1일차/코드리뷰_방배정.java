import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = 0;
        }
        
        while (N-- > 0) {
            int S = sc.nextInt();
            int Y = sc.nextInt();
            
            if ((Y == 1) || (Y == 2)) arr[0]++;
            else if ((Y == 3) || (Y == 4)) {
                if (S == 1) arr[1]++;
                else arr[2]++;
            }
            else {
                if (S == 1) arr[3]++;
                else arr[4]++;
            }
        }
        
        int ans = 0;
        for (int i = 0; i < 5; i++) {
            ans += (arr[i] + K - 1) / K; 
        }
        
        
        System.out.println(ans);
    }
}
