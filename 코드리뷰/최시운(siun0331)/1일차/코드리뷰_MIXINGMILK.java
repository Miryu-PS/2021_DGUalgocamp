/*
i를 0부터 100미만까지 반복하는 반복문에서 진행하면
매 과정을 (i%3)번 에서 ((i+1)%3)번 양동이로 붓는 과정이라고 생각할 수 있습니다.
배열로 각각의 양동이를 저장하고 위 과정을 반복시키면 코드가 좀 더 간소화될 것입니다.
*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 베시
        int bashmax = Integer.parseInt(st.nextToken());
        int bashhaving = Integer.parseInt(st.nextToken());
        //엘시
        st = new StringTokenizer(br.readLine());
        int lmax = Integer.parseInt(st.nextToken());
        int lhaving = Integer.parseInt(st.nextToken());
        //밀드레드
        st = new StringTokenizer(br.readLine());
        int millmax = Integer.parseInt(st.nextToken());
        int millhaving = Integer.parseInt(st.nextToken());
        for (int i =0; i<33; i++){
            lhaving += bashhaving;
            bashhaving = 0;
            if(lhaving > lmax){
                bashhaving = lhaving-lmax;
                lhaving = lmax;

            }
            millhaving += lhaving;
            lhaving = 0;
            if(millhaving > millmax){
                lhaving = millhaving-millmax;
                millhaving = millmax;

            }
            bashhaving += millhaving;
            millhaving = 0;
            if(bashhaving > bashmax){
                millhaving = bashhaving-bashmax;
                bashhaving = bashmax;

            }

        }
        lhaving += bashhaving;
        bashhaving = 0;
        if(lhaving > lmax){
            bashhaving = lhaving-lmax;
            lhaving = lmax;

        }
        System.out.println(bashhaving);
        System.out.println(lhaving);
        System.out.println(millhaving);
    }
}
