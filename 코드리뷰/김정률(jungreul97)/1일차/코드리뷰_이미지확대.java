/*
임시 배열에 출력할 배열을 미리 저장해놓는 좋은 아이디어라고 생각합니다.
다만, 임시 배열에 저장하는 조금 더 간략한 코드를 소개드리고자 합니다.
for(int i = 0; i < m * x; i++){
    for(int j = 0; j < n * x; j++) {
        x_arr[i][j] = arr[i/x][j/x];
    }
}

이 코드를 통해서 기존 배열의 arr[p][q]는 x_arr 배열에서 [(p*x) ~ (p*x + (x-1))][(q*x) ~ (q*x + (x-1))] 범위에 옮겨지게 됩니다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        char[][] arr = new char[m][n];
        for(int i=0;i<m;i++) {
            String str = br.readLine();
            for(int j=0;j<n;j++) {
                arr[i][j] = str.charAt(j);
            }
        }
        String str = br.readLine();
        int x = Integer.parseInt(str);

        char[][] x_arr = new char[x*m][x*n];
        //가로로 늘려주기 위한 임시 배열 저장소 생성
        char[][] ex_arr = new char[x*m][x*n];

        //가로로 x배씩 늘려 임시 배열에 저장
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<x;k++) {
                    ex_arr[i][j*x+k] = arr[i][j];
                    //System.out.print(arr[i][j]); //임시 저장소로 옮겨진지 확인
                }
            }
            //System.out.println();
        }

        //임시 저장소 배열을 세로로 x 배씩 늘려 결과배열에 저장
        for(int i=0;i<m;i++) {
            for(int j=0;j<n*x;j++) {
                for(int k=0;k<x;k++) {
                    x_arr[i*x+k][j] = ex_arr[i][j];
                }
            }
        }
        System.out.println();

        for(int i=0;i<x*m;i++) {
            for(int j=0;j<x*n;j++) {
                System.out.print(x_arr[i][j]);
            }
            System.out.println();
        }
    }

}
