import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int array [] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        int a,b,c=0;
        int cnt=0;
        for(int i = 0;i<num;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = array[a-1];
            if(c!=-1 && c!=b) {
                cnt++;
                array[a-1]=b;
            }
            else {
                array[a-1]=b;
            }
            
        }
        System.out.println(cnt);
    }

}
