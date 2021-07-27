import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static boolean same_point(String[] arr, int i, int j, int d) {
        if((arr[i].charAt(j) == arr[i].charAt(j+d)) &&
                (arr[i].charAt(j+d) == arr[i+d].charAt(j)) &&
                (arr[i+d].charAt(j) == arr[i+d].charAt(j+d))) return true;
        else return false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int max_d = Math.min(N, M);
        String arr[] = new String[N];
        for(int i=0; i<N; i++)  arr[i] = br.readLine();
        
        int max = 0;
        for(int i=0; i<N; i++) {
            for(int j=0; j<arr[i].length(); j++) {
                for(int d=0; d<max_d; d++) {
                    if((i+d>=N)||(j+d>=arr[i].length())) continue;
                    else {
                        if(same_point(arr, i, j, d)) {
                            if((d+1)*(d+1) > max) max = (d+1)*(d+1);
                        }
                    }
                }
            }
        }
        System.out.println(max);
    }

}
