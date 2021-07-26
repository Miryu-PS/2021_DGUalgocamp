import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        for (int i = 0; i <= 50; i++){
            for(int j = 0; j <= 50; j++){
                for(int k =0; k<= 50; k++){
                    if (i*a + j*b + c*k == n){
                        answer = 1;
                        break;
                    }
                }
            }
        }
        System.out.println(answer);

    }
}