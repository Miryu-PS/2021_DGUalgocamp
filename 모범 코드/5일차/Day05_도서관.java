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
            if(map.containsKey(str)) { // map에 이미 str이 있다면
                map.replace(str, map.get(str) + 1); // map의 str의 value값을 1 증가시켜서 수정
            }
            else {
                map.put(str, 1); // str이 없다면 {str, 1}의 매핑 정보를 저장 
            }
        }
        int max = 0;
        String ans = new String();
        for(String i : map.keySet()) { // i는 사전순 오름차순으로 나온다. (TreeMap)
            if(max < map.get(i)) {
                ans = i;
                max = map.get(i);
            }
        }
        System.out.println(ans);
    }

}
