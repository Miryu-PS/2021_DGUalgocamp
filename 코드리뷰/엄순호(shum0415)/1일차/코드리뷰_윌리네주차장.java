import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        
        int fee1 = sc.nextInt();
        int fee2 = sc.nextInt();
        int fee3 = sc.nextInt();
        
        int[][] brr = new int[3][2];
        
        for(int i=0; i<3; i++) {
            brr[i][0] = sc.nextInt();
            brr[i][1] = sc.nextInt();
        }
        
        for(int i=0; i<3; i++) {
            for(int j=brr[i][0]; j<brr[i][1]; j++) {
                arr[j]++;
            }
        }
        
        int ans = 0;
        for(int i=0; i<100; i++) {
            if(arr[i]==1) {
                ans += fee1;
            }
            else if(arr[i]==2) {
                ans += fee2*2;
            }
            else if(arr[i]==3) {
                ans += fee3*3;
            }
        }
        
        System.out.println(ans);
        

    }

}
