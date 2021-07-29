import sys
l=[]
c = 0
n = int(input())
for i in range(n):
    s = sys.stdin.readline().rstrip()
    if s[0] == "b":
        if c == 0:
            c+=len(l)
            for j in range(c):
                print(l.pop(), end = " ")
            if len(l)==0:
                print("")
        
        else:
            c-=1
            
    else:
        l.append(s[2:].strip())
