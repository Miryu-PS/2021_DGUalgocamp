import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        
        int d=Math.min(M, N);
        int tmp=d;
        int max=1;
        
        char [][]arr=new char[N][M];
            
        for(int i=0; i<N; i++) {
            String str=sc.next();
            for(int j=0; j<M; j++) {
                arr[i][j]=str.charAt(j);
            }
        }
        for(int l=0; l<tmp; l++) {
            if(max!=1)break; 
            for(int k=0; k<N-d+1; k++) {
                if(max!=1)break;
                for(int j=0; j<M-d+1; j++) {
                    if(arr[k][j]==arr[k][j+d-1]) {
                        if(arr[k][j]==arr[k+d-1][j]) {
                            if(arr[k+d-1][j]==arr[k+d-1][j+d-1]) {
                                max=d;
                                break;
                            }
                        }
                    }           
            }
            
            } d--;
        }
       
        System.out.println(max*max);
        
    }

}