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
    
    static void bubble_sort(int[] arr, int size) {
        for(int i=1; i<size; i++) {
            for(int j=0; j<size-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    print_arr(arr,size);
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
        print_arr(arr, arr.length);
        bubble_sort(arr, arr.length);
    }

}
