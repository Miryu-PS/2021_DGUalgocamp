"""
조건들 확인하느라 고생하셨습니다. O(1)에 계산된 빠른 코드네요.
이 방법의 개선 방법은 가상의 차량 출입구를 관리하는 겁니다.
a분 ~ b분에 주차된 차량은 a분에 차량 대수 +1 , b분에 차량 대수 -1의 로그를 넣어
총 6개의 차량 로그에 대해 보면서 이전로그로부터의 시간과 현재의 주차된 차량 대수를 이용하여 요금을 계산할 수 있습니다.
"""

f1, f2, f3 = map(int,input().split())
l = []
sum1 = 0
sum2 = 0
sum3 = 0
for i in range(3):
    a,b = map(int,input().split())
    l.append([a,b])
    l.sort()
#주차장 3대 sum3
if min(l[0][1],l[1][1],l[2][1]) - l[2][0] > 0:
    sum3 = (min(l[0][1],l[1][1],l[2][1]) - l[2][0])    


#주차장 2대 sum2
if min(l[0][1],l[1][1])-l[1][0] > 0:
    sum2 += (min(l[0][1],l[1][1])-l[1][0])
if min(l[1][1],l[2][1])-l[2][0] > 0:
    sum2 += (min(l[1][1],l[2][1])-l[2][0])
if min(l[0][1],l[2][1])-l[2][0] > 0:
    sum2 += (min(l[0][1],l[2][1])-l[2][0])
    sum2=sum2-3*sum3

#주차장 1대 sum1
for i in range(3):
    sum1+=(l[i][1]-l[i][0])
sum1 = sum1-sum2*2-sum3*3

print(sum1*f1+sum2*f2*2+sum3*f3*3)
