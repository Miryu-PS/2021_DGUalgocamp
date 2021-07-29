ans = []

str = input()
pointer = 0

for i in range(len(str)):
    if str[i] == '<':
        if(pointer ==0):
            continue;
        pointer -=1;

    elif str[i] == '>':
        if pointer == len(ans):
            continue
        else :
            pointer += 1

    elif str[i] == '-':
        if(pointer == 0):
            continue
        del(ans[pointer-1])
        pointer -=1

    else:
        ans.insert(pointer, str[i])
        pointer += 1

for i in range(len(ans)):
    print(ans[i], end='')


