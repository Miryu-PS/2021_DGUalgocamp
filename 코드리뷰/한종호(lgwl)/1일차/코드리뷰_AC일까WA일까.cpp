/*
	대문자 A, C가 여러번 등장할 때를 고려해주어야 합니다. 수정된 모범코드 참고바랍니다. 
*/
#include <iostream>
using namespace std;

int main() 
{
    ios::sync_with_stdio(0); 
    cin.tie(0); cout.tie(0);

    string ans = "WA", str;

    cin >> str;

    if (str[0] == 'A' && str.size() >= 3 && str[1] >= 'a' && str[1] <= 'z')
    {
        int cExist = 0;
        int allSmallLetter = 1;
        for (int i = 2; i < str.size() - 1; i++)
        {
            if (str[i] == 'C')
                cExist = 1;
            else
            {
                if (!('a' <= str[i] && str[i] <= 'z'))
                {
                    allSmallLetter = 0;
                    break ;
                }
            }
        }
        if (!('a' <= str[str.size() - 1] && str[str.size() - 1] <= 'z'))
            allSmallLetter = 0;
        if (cExist && allSmallLetter)
            ans = "AC";
    }
    
    cout << ans << "\n";

    return (0);
}
