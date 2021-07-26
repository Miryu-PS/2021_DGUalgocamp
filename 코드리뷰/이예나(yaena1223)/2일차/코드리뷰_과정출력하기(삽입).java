import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        for(int z = 0;z<n;z++) {
            System.out.print(array[z]+" ");
        }
        System.out.println();
        
        for(int i = 1;i<n;i++) {
            for(int j = i;j>0;j--) {
                if(array[j-1]>array[j]) {
                    int tmp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = tmp;
                
                    
                    for(int z = 0;z<n;z++) {
                        System.out.print(array[z]+" ");
                    }
                    System.out.println();
                }
            }
            
            
        }
        
        
    }

}