#이전 위치와 달라질 때에만 답에 +1 해주는 아이디어를 각 소마다 위치 정보를 저장해서 구현하셨네요. 좋은 구현입니다.
N = int(input())

arr = [[] for i in range(11)]
answer = 0

for i in range(0,N):
    input1 = input().split(" ")
    cow = int(input1[0])
    position = int(input1[1])

    arr[cow].append(position)

for i in range(0,11):
    if (len(arr[i]) <= 1):
        answer += 0
    else:
        for j in range(1,len(arr[i])):
            if(arr[i][j-1] != arr[i][j]):
                answer += 1

print(answer)
