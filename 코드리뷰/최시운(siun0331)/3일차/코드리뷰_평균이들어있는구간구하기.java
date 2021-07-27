import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        for(int i = 0; i< N; i++){
            int con = sc.nextInt();
            arr[i] = con;
        }
        int count = 0;
        for(int i=0; i<N; i++){
            int sum = 0;
            int numcount = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for(int j =i; j<N;j++){
                sum += arr[j];
                numcount++;
                list.add(arr[j]);
                int average = sum/numcount;
                /*System.out.println(list);
                System.out.println("index: "+ i +" "+ j);
                System.out.println("contant: "+arr[i]+" "+arr[j]);
                System.out.println("aver: "+average+"  last "+sum%numcount);*/
                if(list.contains(average) && sum%numcount == 0){
                    count++;
                    //System.out.println("count");
                }
            }

        }
        System.out.println(count);

    }
}