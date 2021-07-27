import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        TreeMap<String, Integer> map = new TreeMap<>();
		
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(map.containsKey(str)) { // map�� �̹� str�� �ִٸ�
                map.replace(str, map.get(str) + 1); // map�� str�� value���� 1 �������Ѽ� ����
            }
            else {
                map.put(str, 1); // str�� ���ٸ� {str, 1}�� ���� ������ ���� 
            }
        }
        int max = 0;
        String ans = new String();
        for(String i : map.keySet()) { // i�� ������ ������������ ���´�. (TreeMap)
            if(max < map.get(i)) {
                ans = i;
                max = map.get(i);
            }
        }
        System.out.println(ans);
    }

}
