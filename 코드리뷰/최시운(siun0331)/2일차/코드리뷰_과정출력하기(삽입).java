import java.util.Scanner;

public class main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("");
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<n-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j] <arr[j-1]){
                    System.out.println();
                    for(int k = 0; k< n; k++){
                        System.out.print(arr[k]+ " ");
                    }
                    int tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=tmp;
                }
                else{
                    break;
                }
            }

        }
        System.out.println();
        for(int k = 0; k< n; k++){
            System.out.print(arr[k]+ " ");
        }

    }
}