import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int maxn=1000;
        int N=sc.nextInt();
        int []arry = new int[maxn];
        int [][]arry2=new int[maxn][2];
        int answer=0;
        
        for(int i=0; i<N; i++) {
            arry2[i][0]=sc.nextInt();
            arry2[i][1]=sc.nextInt();
            for(int j=arry2[i][0]; j<arry2[i][1]; j++) {
                arry[j]++;
            }
        }
        for(int i=0; i<N; i++) {
            for(int j=arry2[i][0];j<arry2[i][1]; j++)
                arry[j]--;
            int st=0;
            for(int j=0; j<maxn; j++) {
                if(arry[j]!=0)
                    st++;
            }
            if(answer<st)
                answer=st;
            for(int j=arry2[i][0]; j<arry2[i][1]; j++)
                arry[j]++;
        }
        System.out.println(answer);
    }
}
