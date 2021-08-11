import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        ArrayList<Integer[]> arr =new ArrayList<Integer[]>();
        
        int N=Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++) {
            st=new StringTokenizer(br.readLine());
            int start=Integer.parseInt(st.nextToken());
            int end=Integer.parseInt(st.nextToken());
            arr.add(new Integer[] {start,end});
        }
        
        Collections.sort(arr, new Comparator<Integer[]>() {
            public int compare(Integer[]a, Integer[]b) {
                if(a[1]==b[1])
                    return a[0].compareTo(b[0]);
                return a[1].compareTo(b[1]);
            }
        });
        
        Stack<Integer>stack=new Stack<Integer>();
        stack.add(arr.get(0)[1]);
        for(int i=1; i<N; i++) {
            Integer[]tmp=arr.get(i);
            if(stack.peek()<=tmp[0]) {
                stack.push(tmp[1]);
            }
        }
        System.out.println(stack.size());
    }

}