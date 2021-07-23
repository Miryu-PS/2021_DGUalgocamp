/*
i번 라이프가드에 대해서 다른 라이프가드가 함께 일하는 시간을 탐색하여 구현하셨군요.
이 경우 시간복잡도를 고려해보면 O(N^2 * 1000) 이 됨을 확인할 수 있습니다.
적절한 전처리 작업(모범코드에서의 arr[i] 계산)등을 통해 시간복잡도를 줄일 수 있습니다. 
*/
#include <iostream>
#include <string.h>
#include <vector>
using namespace std;

int ans = -1;

vector<pair<int, int> > lifeGuard;

int main() 
{
    ios::sync_with_stdio(0); 
    cin.tie(0); cout.tie(0);

    int N;
    cin >> N;

    for (int i = 0; i < N; i++)
    {
        int start, end;
        cin >> start >> end;
        lifeGuard.push_back({start, end});
    }

    for (int i = 0; i < lifeGuard.size(); i++)
    {
        int second[1001] = {0, };

        int cnt = 0;
        for (int j = 0; j < lifeGuard.size(); j++)
        {
            if (i == j)
                continue ;
               
            for (int k = lifeGuard[j].first; k < lifeGuard[j].second; k++)
                second[k] = 1;            
        }

        for (int k = 1; k <= 1000; k++)
            if (second[k] == 1)
                cnt++;

        if (cnt > ans)
            ans = cnt;
        memset(second, 0, 1001 * sizeof(int));
    }

    cout << ans << "\n";

    return (0);
}
