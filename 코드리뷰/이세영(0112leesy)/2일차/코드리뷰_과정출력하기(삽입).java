import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static void print_arr(int[] arr, int size) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size; i++) sb.append(arr[i]+" ");
        System.out.println(sb);
    }
    
    static void insert_sort(int[] arr, int size) {
        for(int i=1; i<size; i++) {
            int target = arr[i];
            for(int j=i-1; j>=0; j--) {
                if(target < arr[j]) {
                    arr[j+1] = arr[j];
                    arr[j] = target;
                    print_arr(arr, size);
                }
                else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
        print_arr(arr,arr.length);
        insert_sort(arr, arr.length);
    }

}
