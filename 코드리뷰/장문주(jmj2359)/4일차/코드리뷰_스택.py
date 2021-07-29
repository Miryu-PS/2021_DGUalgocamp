l = []
s = ""
while s != "end":
    s = input()
    if "push" in s:
        a = s.split()[1]
        print(a)
        l.append(a)
    elif s == "pop":
        if len(l) == 0:
            print(-1)
        else:
            print(l.pop())
    elif s == "size":
        print(len(l))
    elif s == "empty":
        if len(l)==0:
            print(1)
        else:
            print(0)
    elif s == "top":
        if len(l) == 0:
            print(-1)
        else:    
            print(l[len(l)-1])
