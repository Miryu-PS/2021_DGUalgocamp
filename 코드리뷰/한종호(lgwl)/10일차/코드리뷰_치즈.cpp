#include <iostream>
#include <queue>
#include <string.h>
using namespace std;
 
int dir_x[4] = {0, 0, 1, -1};
int dir_y[4] = {1, -1, 0, 0};
int arr[101][101], inAir[101][101], visited[101][101], check[101][101];

int main()
{
    ios::sync_with_stdio(0);
    cin.tie(0); cout.tie(0);

    int n, m, ans = 0;
    cin >> n >> m;
 
    for (int i = 0; i < n; i++)
        for (int j = 0; j < m; j++)
            cin >> arr[i][j];
 
    while (1)
    {
        memset(inAir, 1, sizeof(inAir));
        memset(visited, 0, sizeof(visited));
        memset(check, 0, sizeof(check));
        queue<pair<int, int> > q;
 
        q.push({0, 0});
        while (!q.empty())
        {
            int x = q.front().first;
            int y = q.front().second;
            q.pop();
 
            if (visited[x][y])
                continue ;
 
            visited[x][y] = 1;
            inAir[x][y] = 0;
            for (int i = 0; i < 4; i++)
            {
                int nx = x + dir_x[i];
                int ny = y + dir_y[i];

                if (nx < 0 || nx > n - 1 || ny < 0 || ny > m - 1)
                    continue ;
 
                if (arr[nx][ny] == 1)
                    check[nx][ny]++;
                else if (!visited[nx][ny])
                    q.push({nx, ny});
            }
        }
 
        int melt = 0;
        for (int i = 0 ; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (check[i][j] >= 2)
                {
                    arr[i][j] = 0;
                    melt = 1;
                }
            }
        }
 
        if (melt)
            ans++;
        else
            break ;
    }

    cout << ans << "\n";

    return (0);
}
