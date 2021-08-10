import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N=Integer.parseInt(br.readLine());
        
        ArrayList<Integer>arr=new ArrayList<>();
        
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            int N1=Integer.parseInt(st.nextToken());
            arr.add(N1);
        }
        Collections.sort(arr);
        
        int ans=0;
        for(int i=0; i<N; i++) {
            if(ans+1<arr.get(i)) {
                break;
            }
            ans+=arr.get(i);
        }
        System.out.println(ans+1);
    }

}