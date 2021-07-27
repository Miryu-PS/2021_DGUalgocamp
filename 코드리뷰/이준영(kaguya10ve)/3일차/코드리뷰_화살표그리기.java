import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            a.add(new ArrayList<>());
        }
 
        for (int i = 0; i < N; i++) {
            int x =sc.nextInt();
            int y =sc.nextInt();
            a.get(y).add(x);
        }
        for(int i=0; i<N; i++) {
            Collections.sort(a.get(i));
        }
        int d=0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<a.get(i).size(); j++) {
                if(j==0) {
                    d+=a.get(i).get(1)-a.get(i).get(0);
                } else if(j==a.get(i).size()-1) {
                    d+=a.get(i).get(j)-a.get(i).get(j-1);
                } else {
                    int d1=a.get(i).get(j+1)-a.get(i).get(j);
                    int d2=a.get(i).get(j)-a.get(i).get(j-1);
                    d+=Math.min(d1, d2);
                }
            }
        }
        System.out.println(d);
    }

}
