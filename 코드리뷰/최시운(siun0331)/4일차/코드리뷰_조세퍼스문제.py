queue = []
answer = []
index = 0

m, n = input().split(" ")
m, n = int(m), int(n)

for i in range(1,m+1) :
    queue.append(i)

while queue:
    index += n-1
    index = index%len(queue)
    a = queue.pop(index)
    answer.append(a)





for i in range(len(answer)):
    print(answer[i], end = ' ')

