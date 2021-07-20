import java.util.*;

public class main {
	
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		
		int l1 = b - a, l2 = d - c, l = 0, x1, x2;
		
		if (c < b) {
			if (a < c) x1 = c;
			else x1 = a;
			
			if (b < d) x2 = b;
			else x2 = d;
			
			l = x2 - x1;
		}
		
		System.out.println(l1 + l2 - l);
	}
}
