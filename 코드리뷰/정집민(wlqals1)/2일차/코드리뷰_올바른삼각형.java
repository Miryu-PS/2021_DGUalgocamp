import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] points = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            points[i][0] = Integer.parseInt(st.nextToken());
            points[i][1] = Integer.parseInt(st.nextToken());
        }
        
        int max = 0;

        for (int i = 0; i < points.length - 2; i++) {
            for (int j = i + 1; j < points.length - 1; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    if ((points[i][0] == points[j][0] && points[j][0] == points[k][0])
                            || (points[i][1] == points[j][1] && points[j][1] == points[k][1])) {
                        continue;
                    }
                    int b = 0;
                    int h = 0;
                    
                    
                    if (points[i][0] == points[j][0]) {
                        h = Math.abs(points[i][1] - points[j][1]);
                    } else if (points[j][0] == points[k][0]) {
                        h = Math.abs(points[j][1] - points[k][1]);
                    } else if (points[i][0] == points[k][0]) {
                        h = Math.abs(points[i][1] - points[k][1]);
                    } else {// y축 평행선 없음
                        continue;
                    }

                    if (points[i][1] == points[j][1]) {
                        b = Math.abs(points[i][0] - points[j][0]);
                    } else if (points[j][1] == points[k][1]) {
                        b = Math.abs(points[j][0] - points[k][0]);
                    } else if (points[i][1] == points[k][1]) {
                        b = Math.abs(points[i][0] - points[k][0]);
                    } else {// x축 평행선 없음
                        continue;
                    }
                    if(b*h>max) max = b*h;
                    
                }

            }

        }
        
        System.out.println(max);
    }

}
