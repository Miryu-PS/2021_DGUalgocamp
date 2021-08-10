import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>(n);
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(arr);
        
        int mid = 0;
        if(n%2 == 0) {
            mid = n/2-1;
        }else {
            mid = n/2;
        }
        int min_sum = Integer.MAX_VALUE;
        int result = 0;
        for(int i=mid;i<=mid+1;i++) {
            int sum = 0;
            for(int j=0;j<n;j++) {
                sum+=Math.abs(arr.get(i)-arr.get(j));
            }
//            System.out.println(arr.get(i));
//            System.out.println(sum);
            if (sum<min_sum) {
                min_sum = sum; 
                result = arr.get(i);
            }
        }
        System.out.println(result);
    }

}