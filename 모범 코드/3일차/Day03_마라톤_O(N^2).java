import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.lang.Math;

public class main {
	public static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
		arr = new int[100005][2];
        for(int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		int basedist = 0;
		for(int i=2; i<=N; i++) {
			basedist += dist(i-1, i);
		}
        int ans =  1987654321;
        for(int i=2; i<N; i++) { // i�� üũ����Ʈ�� �ǳʶپ��
        	int totaldist = 0;
        	for(int j=1; j<N; j++) { // j ~ (j+1) �Ÿ��� �����ش�.
        		if(j == i - 1) { // ���� j+1���� �ǳʶپ�� �Ѵٸ�
        			totaldist += dist(j, j+2); // j���� j+2�� ������ �Ÿ��� �����ش�.
        		}
        		else if(j == i) { // j���� �ǳʶپ�� �Ѵٸ�
        			continue; // ��� ���� �������� �ʴ´�.
        		}
        		else { // j ~ (j+1) �Ÿ��� �����ش�.
        			totaldist += dist(j, j+1);
        		}
        	}
			if(totaldist < ans) ans = totaldist; 
        }
        System.out.println(ans);
    }
	public static int dist(int x, int y) {
		return Math.abs(arr[x][0] - arr[y][0]) + Math.abs(arr[x][1] - arr[y][1]);
	}

}