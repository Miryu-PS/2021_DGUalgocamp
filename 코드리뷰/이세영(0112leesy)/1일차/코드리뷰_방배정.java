import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[5];
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());
            
            if((grade==1) || (grade==2)) arr[0]++;
            else if((grade==3) || (grade==4)) {
                if(gender==0) arr[1]++;
                else arr[2]++;
            }
            else {
                if(gender==0) arr[3]++;
                else arr[4]++;
            }
        }
        int room = 0;
        for(int i=0; i<5; i++) {
            room += (arr[i]+K-1)/K;
        }
        System.out.println(room);
    }

}
