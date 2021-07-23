"""
count를 통해 해당 원소가 2개 이상 존재하는지 확인한 코드네요.
지금은 입력 사이즈가 작아서 상관없지만, 나중에는 count(i)가 O(N)에 해당 개수를 찾아주기 때문에
시간초과가 날 수도 있습니다. 존재 여부를 배열에 체크하는 방법도 숙지해두시면 좋겠습니다!
"""

n = input()
c = 0
l = []
d = {"P":13,"K":13,"H":13,"T":13}
for i in range(len(n)//3):
    c =2+3*i
    l.append(n[c-2:c+1])
for i in l:
    if l.count(i)>=2:
        print("GRESKA")
        break
    else:
        for i in l:
            d[i[0]]-=1
        for i in d.values():
            print(i, end=" ")
        print("")
        break
