import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String newCover = br.readLine();
        String[] oldCovers = new String[n];
        for (int i = 0; i < n; i++) {
            oldCovers[i] = br.readLine();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            char[] oldCover = oldCovers[i].toCharArray();
            boolean pos = false;
            for (int j = 1; j <= oldCover.length; j++) {// 간격
                for (int s = 0; s < oldCover.length; s++) {// 시작점
                    if (s + (newCover.length() - 1) * j >= oldCover.length)
                        continue;
                    boolean same = true;
                    for (int k = 0; k < newCover.length(); k++) {
                        if (newCover.charAt(k) != oldCover[s + k * j])
                            same = false;
                    }
                    if (same)
                        pos = true;
                }

            }
            if (pos)
                cnt++;
        }
        System.out.println(cnt);
    }

}
