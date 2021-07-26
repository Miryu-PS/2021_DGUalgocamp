import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        for(int i=1; i<n; i++) {
            for(int j=i; j>0; j--) {
                if(arr[j-1]>arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    for(int k=0; k<n; k++) {
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                }    
            }
        }
        sc.close();
    }
}