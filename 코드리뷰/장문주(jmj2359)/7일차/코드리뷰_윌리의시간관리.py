import sys
l = []
n = int(sys.stdin.readline())
for i in range(n):
    time, end = map(int,sys.stdin.readline().rstrip().split())
    l.append((end,time))
l.sort(reverse = True)

#다음 과제 끝난 시간
end = l[0][0]
#다음 과제 시작 시간
start = l[0][0]-l[0][1]
idx = 1
while True:
    #이전과제 시작 시간 = 다음 과제 시작 시간 - 이전과제에 걸리는 시간 >= 0
    if idx == len(l):
        break
    if start >= l[idx][0]:
        start = l[idx][0]
    if start - l[idx][1] >= 0:
        start -= l[idx][1]
    else:
        start = -1
        break
    idx += 1    
print(start)
        
