import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    static int[] arr;
    static int[] temp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr= new int[n];
        temp = new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        mergeSort(0,arr.length-1);
        
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
        
    }
    static void mergeSort(int from, int to) {
        mergeSort(from, to, (from+to)/2);
    }
    static void mergeSort(int from, int to, int mid) {
        if(from==to) return;
        mergeSort(from,mid);
        mergeSort(mid+1,to);
        int l = from;
        int r = mid+1;
        int idx = from;
        while(l<=mid&&r<=to) {
            if(arr[l]<=arr[r]) {
                temp[idx] = arr[l];
                l++;
                idx++;
            }else {
                temp[idx] = arr[r];
                r++;
                idx++;
            }
        }
        while(l<=mid) {
            temp[idx] = arr[l];
            l++;
            idx++;
        }
        while(r<=to) {
            temp[idx] = arr[r];
            r++;
            idx++;
        }
        for (int i = from; i <= to; i++) {
            arr[i] = temp[i];
        }
        
    }

}
