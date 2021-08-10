import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            int x = Integer.parseInt(br.readLine());
            list.add(x);
        }

        Collections.sort(list, Comparator.reverseOrder());

        int index = list.size();
        int max = 0;

        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < index; j++){
                sum = list.get(index-1)*index;
            }
            if (sum > max) max = sum;
            index --;
        }

        System.out.println(max);

    }
}