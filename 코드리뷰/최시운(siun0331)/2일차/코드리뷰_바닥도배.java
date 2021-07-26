import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();   //가장자리
        int B = sc.nextInt();   //센터

        int total = R+B; //타일의 총 개수

        int L = 1;
        int W = total/L;

        while (true){
            if(L*W == total && (L-2)*(W-2) == B){
                if (L < W){
                    int tmp = L;
                    L = W;
                    W = tmp;
                }
                System.out.println(L+" "+W);
                break;
            }
            else {
                L++;
                W = total/L;
            }
        }
    }
}