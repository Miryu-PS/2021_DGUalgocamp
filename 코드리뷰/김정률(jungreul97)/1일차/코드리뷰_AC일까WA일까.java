/*
이 코드는 제출했을 때에는 맞게 나왔지만 3가지의 문제점이 있습니다.
1. 'C'가 실제로 배열에 나타나는지 확인하지 않았습니다. 실제로 "Accept" 를 입력하면 WA가 나와야하지만 이 코드에서는 AC가 나오고 있습니다.
2. 'C'가 조건에 맞는 곳에도 등장하고, 마지막에도 등장하였을 경우 무조건 WA가 출력됩니다. 예시로는 "AccCeptC" 에서는 AC가 출력되어야 하지만 WA가 출력되고 있습니다.
2. 'A'가 시작 위치가 아닌 곳에서도 등장하였을 때, 대문자로 인식하여 WA를 출력합니다. 문제에서는 A와 C는 대문자로 나타나도 되도록 규정하고 있습니다.
반복문을 통해 C가 실제로 저 범위에 존재하는지를 찾고, 전체 문자들 중 'A', 'C', 소문자가 아닌 것이 존재하는 지 검사하는 것이 바람직합니다.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

    public static void main(String[] args) throws IOException{
        // TODO Auto-generated method stub
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int n = str.length();
        char[] arr = new char[n];
        for(int i=0;i<n;i++) {
            arr[i] = str.charAt(i);
        }
        String result = "AC";
        if(arr[0] != 'A' || arr[1] == 'C' || arr[n-1] == 'C') {
            result = "WA";
        }else {
            for(int i=1;i<n;i++) {
                if(arr[i] != 'C' && arr[i]<'a') {
                    result = "WA";
                }
            }
        }

        System.out.println(result);

    }

}
