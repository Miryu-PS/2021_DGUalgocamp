/*
우유를 붓는 과정을 다음과 같이도 구현할 수 있습니다.
#include <algorithm>
...
int totalmilk =  milk[order][1] + milk[nextOrder][1];
milk[nextOrder][1] = min(totalmilk, milk[nextOrder][0]);
milk[order][1] = totalmilk - milk[nextOrder][1];
*/

#include <iostream>
using namespace std;

int main() 
{
    ios::sync_with_stdio(0); 
    cin.tie(0); cout.tie(0);

    long long milk[3][2];
    for (int i = 0; i < 3; i++)
        cin >> milk[i][0] >> milk[i][1];

    for (int i = 0; i < 100; i++)
    {
        int order = i % 3;
        int nextOrder = (i + 1) % 3;
        if (milk[order][1] <= milk[nextOrder][0] - milk[nextOrder][1])
        {
            milk[nextOrder][1] += milk[order][1];
            milk[order][1] -= milk[order][1];
        }
        else
        {
            long long temp = milk[nextOrder][0] - milk[nextOrder][1];
            milk[nextOrder][1] += temp;
            milk[order][1] -= temp;
        }
    }

    cout << milk[0][1] << "\n" << milk[1][1] << "\n" << milk[2][1] << "\n";

    return (0);
}
