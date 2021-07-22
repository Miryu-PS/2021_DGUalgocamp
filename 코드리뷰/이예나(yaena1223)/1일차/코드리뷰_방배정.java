import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int array [] = new int [5];
        for(int i = 0;i<5;i++) {
            array[i] = 0;
        }
        for(int i = 0;i<N;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b==1||b==2) array[0]++;
            else if(a==0&&(b==3||b==4)) array[1]++;
            else if(a==1&&(b==3||b==4)) array[2]++;
            else if(a==0&&(b==5||b==6)) array[3]++;
            else if(a==1&&(b==5||b==6))array[4]++;
        }
        int num = 0;
        for(int i = 0;i<5;i++) {
            if (array[i]%K==0) num = num+(array[i]/K);
            else num = num+(array[i]/K+1);
        }
        System.out.println(num);
    }

}
