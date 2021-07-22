import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        char[][]arr=new char[100][100];
        for(int i=0; i<N; i++) {
            String str=sc.next();
            for(int j=0; j<M; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        
        int k=sc.nextInt();
        for(int i=0; i<N; i++) {
            for(int I=0; I<k; I++) {
                for(int j=0; j<M; j++) {
                    for(int J=0; J<k; J++) {
                        System.out.print(arr[i][j]);
                    }
                }
                System.out.println("\n");
            }
        }
    }

}