import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String img[] = new String[n];
        for(int i=0; i<n; i++) {
            img[i] = br.readLine();
        }
        int x = Integer.parseInt(br.readLine());
        String x_img[] = new String[x*n];
        for(int i=0; i<n; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<m; j++) {
                for(int k=0; k<x; k++) sb.append(img[i].charAt(j));
            }
            for(int k=0; k<x; k++) x_img[i*x+k] = sb.toString();
        }
        for(int i=0; i<x*n; i++) System.out.println(x_img[i]);
    }

}
