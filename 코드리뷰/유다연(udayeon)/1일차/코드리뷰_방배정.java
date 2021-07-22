import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int arr[] = new int [5];
        int N, K, S, Y;
        
        Scanner scanner = new Scanner(System.in);
        
        N = scanner.nextInt();
        K = scanner.nextInt();
        
        for(int i=0; i<N; i++) {
            S = scanner.nextInt();
            Y = scanner.nextInt();
            
            if(Y == 1 || Y == 2)
                arr[0]++;
            else if(Y == 3 || Y == 4) {
                if(S == 1)
                    arr[1]++;
                else
                    arr[2]++;
            }
            
            else {
                if(S == 1)
                    arr[3]++;
                else
                    arr[4]++;
            }
        }
        
        int room = 0;
        for(int i = 0; i<5; i++) {
            if(arr[i]%K==0)
                room+=(arr[i]/K);
            else
                room+=(arr[i]/K)+1;
        }
        
        System.out.println(room);
        
        scanner.close();
    }
}