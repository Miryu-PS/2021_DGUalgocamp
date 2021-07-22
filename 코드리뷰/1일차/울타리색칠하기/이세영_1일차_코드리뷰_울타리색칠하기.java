import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int b = Integer.parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int c = Integer.parseInt(st2.nextToken());
        int d = Integer.parseInt(st2.nextToken());
        boolean[] arr = new boolean[101];
        for(int i=a; i<b; i++) arr[i] = true;
        for(int i=c; i<d; i++) arr[i] = true;
        int cnt = 0;
        for(int i=0; i<101; i++) if(arr[i]) cnt++;
        System.out.println(cnt);
                
    }

}