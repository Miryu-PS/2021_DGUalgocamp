#include <iostream>
using namespace std;

int main()
{
	ios::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);

	int N, M, sum, low = 0, high = 0, ans = 0;
	int arr[501];

	cin >> N >> M;
	for (int i = 0; i < N; i++)
		cin >> arr[i];

	sum = arr[0];
	while (low <= high && high < N)
	{
		if (sum == M)
			ans++;
		if (sum >= M)
			sum -= arr[low++];
		if (sum < M)
			sum += arr[++high];
	}

	cout << ans << "\n";

	return (0);
}