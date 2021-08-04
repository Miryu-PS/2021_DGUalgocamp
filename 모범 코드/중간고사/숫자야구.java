import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ 
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        // 영수가 생각할 수 있는 수를 lst에 넣습니다.
        ArrayList<String> lst = new ArrayList<String>();
        for (int i = 1; i <= 9; i++) { 
        	for (int j = 1; j <= 9; j++) {
        		for(int k = 1; k <= 9; k++) {
        			if ((i - j) * (j - k) * (k - i) != 0)
        				lst.add(Integer.toString(i * 100 + j * 10 + k));
        		}
        	}
        }
        
        int N = Integer.parseInt(br.readLine());
        
        while (N-- > 0) {
        	st = new StringTokenizer(br.readLine());
        	String num = st.nextToken();
        	char n1 = num.charAt(0);
        	char n2 = num.charAt(1);
        	char n3 = num.charAt(2);
        	int s = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	for (int i = 0; i < lst.size();) {
        		String x = lst.get(i);
        		char x1 = x.charAt(0);
            	char x2 = x.charAt(1);
            	char x3 = x.charAt(2);
            	int xs = 0, xb = 0;
            	// 스트라이크의 수
            	if (x1 == n1) xs++;
            	if (x2 == n2) xs++;
            	if (x3 == n3) xs++;
            	// 볼의 수
            	if ((x1 == n2) || (x1 == n3)) xb++;
            	if ((x2 == n1) || (x2 == n3)) xb++;
            	if ((x3 == n1) || (x3 == n2)) xb++;
            	
            	// 스트라이크와 볼의 수가 모두 일치하면 다음 원소로 넘어가고, 그렇지 않으면 현재 원소를 삭제합니다.
            	if ((xs == s) && (xb == b)) i++;
            	else lst.remove(i);
        	}
        }
        
        System.out.print(lst.size());
    }
}