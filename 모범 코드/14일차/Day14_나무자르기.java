import java.io.*;
import java.util.*;

public class main {
	static int N, M;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int l=0, r=1000000000;
		
		while(l<r) {
			int mid = (l+r+1)/2;
			if(chk(mid)) l=mid;
			else r=mid-1;
		}
		System.out.println(l);
	}
	public static boolean chk(int x) {
		long sum = 0;
		for(int i=0; i<N; i++) {
			if(arr[i] >= x) {
				sum += (arr[i]-x);
			}
		}
		if(sum >= (long)M) {
			return true;
		}
		else return false;
	}
}