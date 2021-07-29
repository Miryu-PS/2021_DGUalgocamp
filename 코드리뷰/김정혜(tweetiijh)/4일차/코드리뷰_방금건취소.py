n=int(input())
stack=[]

ans=0
for i in range(n):
    x=int(input())
    if x!=0:
        stack.append(x)

    if x==0:
        stack.pop()



while len(stack)>0:
    ans+=stack.pop()
    
print(ans)
