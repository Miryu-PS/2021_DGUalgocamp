import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        TreeSet<String> tset=new TreeSet<>();
        StringTokenizer st;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        st=new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int M=Integer.parseInt(st.nextToken());
        for(int i=0; i<N; i++) {
            String str=br.readLine();
            tset.add(str);
        }
        int ans=0;
        for(int i=0; i<M; i++) {
            String str=br.readLine();
            if(!tset.add(str)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

}