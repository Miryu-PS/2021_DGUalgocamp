import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        while(n-->0) {
            String book = br.readLine();
            tm.put(book, tm.getOrDefault(book, 0)+1);
            if(tm.get(book)>max) max=tm.get(book);
        }
        for(String book:tm.keySet()) {
            if(max==tm.get(book)) {
                sb.append(book).append('\n');
                break;
            }
        }
        System.out.println(sb);
    }

}
