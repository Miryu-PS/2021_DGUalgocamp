N, M = list(map(int, input().rstrip().split(" ")))
arr = list(map(int, input().rstrip().split(" ")))
answer = 0

for n in range(0,N):
    for size in range(1,N + 1):
        if (n + size > len(arr)):
            continue
        # print(arr[n : n + size])
        if (sum(arr[n : n + size]) == M):
            answer += 1
    # print()
print(answer)
