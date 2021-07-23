/*
i�� ���������忡 ���ؼ� �ٸ� ���������尡 �Բ� ���ϴ� �ð��� Ž���Ͽ� �����ϼ̱���.
�� ��� �ð����⵵�� ����غ��� O(N^2 * 1000) �� ���� Ȯ���� �� �ֽ��ϴ�.
������ ��ó�� �۾�(����ڵ忡���� arr[i] ���)���� ���� �ð����⵵�� ���� �� �ֽ��ϴ�. 
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
