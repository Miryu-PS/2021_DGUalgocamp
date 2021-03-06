#include <iostream>
using namespace std;

int N, M, ans = 0;
int map[101][101], visited[101];

void dfs(int idx)
{
	visited[idx] = 1;
	ans++;
	for (int i = 1; i <= N; i++)
		if (!visited[i] && map[idx][i])
			dfs(i);
}

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);

	cin >> N >> M;
	for (int i = 0; i < M; i++)
	{
		int a, b;
		cin >> a >> b;
		map[a][b] = map[b][a] = 1;
	}

	dfs(1);
	cout << ans - 1 << "\n";

	return (0);
}