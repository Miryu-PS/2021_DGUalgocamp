import java.util.Scanner;

public class main {

    public static void main(String[] args) { // 과정 출력하기 삽입 
        // TODO Auto-generated method stub
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int k=0; k<n; k++) {
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        
        for(int i=1; i<n; i++) {
            int target = arr[i];
            int j = i;
            while(j>=1 && arr[j-1]>target) {
                arr[j] = arr[j-1];
                arr[j-1] = target;
                j--;
                for(int k=0; k<n; k++) {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            arr[j] = target;
        }

    }

}
