/*
stoi �Լ��� ���� ����Դϴ�.
�ٸ� (str[i+1]-'0')*10 +  (str[i+2]-'0') �� ���� ������ �����صνñ� �ٶ��ϴ�. 
*/
#include <iostream>
#include <string>
using namespace std;

int main() 
{
    ios::sync_with_stdio(0); 
    cin.tie(0); cout.tie(0);

    int card[4][13] = {0, };
    int cardLeft[4] = {13, 13, 13, 13};
    string str;
    cin >> str;

    for (int i = 0; i < str.size(); i += 3)
    {
        int giho = -1;
        if (str[i] == 'P')
            giho = 0;
        else if (str[i] == 'K')
            giho = 1;
        else if (str[i] == 'H')
            giho = 2;
        else 
            giho = 3;

        string tmp;
        tmp += str[i + 1];
        tmp += str[i + 2];
        int num = stoi(tmp) - 1;
        if (card[giho][num] == 1)
        {
            cout << "GRESKA\n";
            return (0);
        }
        card[giho][num] = 1;
        cardLeft[giho]--;
    }
    cout << cardLeft[0] << " " << cardLeft[1] << " " << cardLeft[2] << " " << cardLeft[3];
    return (0);
}
