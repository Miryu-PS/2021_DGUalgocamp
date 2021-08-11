import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int N=Integer.parseInt(br.readLine());
        
        ArrayList<Integer[]>arr=new ArrayList<Integer[]>();
        
        for(int i=0; i<N; i++) {
            st=new StringTokenizer(br.readLine());
            int amount=Integer.parseInt(st.nextToken());
            int time=Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {amount,time});
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[]a, Integer[]b) {
                return b[1].compareTo(a[1]);
            }
        });
        
        int temp=arr.get(0)[1]-arr.get(0)[0];
        for(int i=0; i<N-1; i++) {
            if(arr.get(i+1)[1]>=temp) {
                temp-=arr.get(i+1)[0];
                if(temp<0) {
                    temp=-1;
                    break;
                }
            } else {
                temp=arr.get(i+1)[1]-arr.get(i+1)[0];
            }
        }
        
        System.out.println(temp);
    }

}
