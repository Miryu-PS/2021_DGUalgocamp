import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int min = 101;
        int max = 0;
        for (int i =0; i<2;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if (m < min) min = m;
            if (n > max) max = n;
            for(int j = m; j<n; j++){
                arr[j] += 1;
            }
        }
        int answer = 0;
        for (int i = min; i <max; i++){
            if (arr[i] >0) answer++;
        }

        System.out.println(answer);


    }
}