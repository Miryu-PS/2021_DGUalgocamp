import java.util.Scanner;

public class main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();   //�����ڸ�
        int B = sc.nextInt();   //����

        int total = R+B; //Ÿ���� �� ����

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