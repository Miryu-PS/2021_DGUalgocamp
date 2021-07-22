import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {
    static int[][] lifeguards;
    static int[] schedule = new int[1000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfLifeguard = Integer.parseInt(br.readLine());
        lifeguards = new int[numberOfLifeguard][2];

        for (int i = 0; i < schedule.length; i++) {
            schedule[i] = 0;
        }

        for (int i = 0; i < numberOfLifeguard; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            lifeguards[i][0] = Integer.parseInt(st.nextToken());
            lifeguards[i][1] = Integer.parseInt(st.nextToken());
            for (int j = lifeguards[i][0]; j < lifeguards[i][1]; j++) {
                schedule[j]++;
            }
        }
        int maxTime = 0;
        for (int i = 0; i < numberOfLifeguard; i++) {
            int timeCount= 0;
            for (int j = lifeguards[i][0]; j < lifeguards[i][1]; j++) {
                schedule[j]--;
            }
            
            for (int j = 0; j < schedule.length; j++) {
                if(schedule[j]!=0) {
                    timeCount++;
                }
            }
            if(timeCount>maxTime) maxTime = timeCount;
            for (int j = lifeguards[i][0]; j < lifeguards[i][1]; j++) {
                schedule[j]++;
            }
        }
        System.out.println(maxTime);
    }
}
