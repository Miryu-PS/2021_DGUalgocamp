arr = list(input())
brr = ['|' for i in range(100000)]
last = -1
pos = True
for a in arr:
    if (a == '('):
        last += 1
        brr[last] = '('
    else:
        if (last < 0):
            pos = False
            break
        else:
            brr[last] = '|'
            last -= 1
if (last != -1):
    pos = False
if pos:
    print(":)")
else:
    print(":(")
