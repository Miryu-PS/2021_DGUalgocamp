import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        int n = Integer.parseInt(br.readLine());
        int [] array1 = new int [n];
        Integer [] array2 = new Integer
                [n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++) {
            array1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<n;i++) {
            array2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array1);
        Arrays.sort(array2,Collections.reverseOrder());
        int ans = 0;
        for(int i = 0;i<n;i++) {
            int a = array1[i]*array2[i];
            ans = ans+a;
        }
        System.out.println(ans);
    }

}