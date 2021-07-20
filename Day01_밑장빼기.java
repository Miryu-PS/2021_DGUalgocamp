
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class main{
    public static void main(String[] args) throws IOException{ // BufferedReader를 사용하기 위해서는 해당 메소드에 throws IOException 구문이 필수입니다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
//        // 입력 형태 : "N"
//        int N = Integer.parseInt(br.readLine());
//        
//        // 입력 형태 : "N1 N2" 
//        st = new StringTokenizer(br.readLine());
//        int N1 = Integer.parseInt(st.nextToken());
//        int N2 = Integer.parseInt(st.nextToken());
//        
//        // 입력 형태 : "string"
//        String str = br.readLine();
//        
//        // 입력 형태 : "string1 string2 string3"
//        st = new StringTokenizer(br.readLine());
//        String str1 = st.nextToken();
//        String str2 = st.nextToken();
//        String str3 = st.nextToken();
        
        String str = br.readLine();
        
        int[][] cards = new int[4][14];
        for (int i = 0; i < 4; i++) {
        	cards[i][0] = 13;
        	for (int j = 1; j < 14; j++) {
        		cards[i][j] = 0;
        	}
        }
        
        for (int i = 0; i < str.length() / 3; i++) {
        	int shape = -1, num;
        	char x = str.charAt(3 * i);
        	switch(x) {
        	case 'P':
        		shape = 0;
        		break;
        	case 'K':
        		shape = 1;
        		break;
        	case 'H':
        		shape = 2;
        		break;
        	case 'T':
        		shape = 3;
        		break;
        	}
        	
        	num = 10 * (str.charAt(3 * i + 1) - '0') + str.charAt(3 * i + 2) - '0';
        	if (cards[shape][num] == 1) {
        		System.out.println("GRESKA");
        		return;
        	}
        	cards[shape][num]++;
        	cards[shape][0]--;
        }
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < 4; i++) {
        	sb.append(Integer.toString(cards[i][0]) + " ");
        }
        System.out.println(sb.toString());
        
    }
}