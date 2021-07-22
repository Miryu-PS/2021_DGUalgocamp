import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int arr[]=new int[100];
        for(int i=0; i<arr.length; i++) {
            arr[i]=-1;
        }
        int count=0;
        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(arr[A]==-1) {
                arr[A]=B;
            } else if(arr[A]!=B) {
                arr[A]=B;
                count++;
            }
        }
        System.out.println(count);
    }

}