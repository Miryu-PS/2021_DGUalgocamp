import sys
from queue import PriorityQueue
n = int(sys.stdin.readline())
pd = PriorityQueue()
pd2 = PriorityQueue()

total=0
for i in range(n):
    day, score = map(int,sys.stdin.readline().rstrip().split())
    pd.put((day,score))


while True:
    if pd.empty()==True:
        break
    peek = pd.get()
    if peek[0] > pd2.qsize():        
        pd2.put(peek[1])
        peek2 = pd2.get()
        pd2.put(peek2)
    elif peek[1] > peek2:
        pd2.get()
        pd2.put(peek[1])


total = 0
while True:
    if pd2.empty()==True:
        break
    else:
        total+=pd2.get()
print(total)
