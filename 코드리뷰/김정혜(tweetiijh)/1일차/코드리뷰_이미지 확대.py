#답을 출력할 임시배열을 만들어서 그 임시배열을 출력하는 아이디어네요.
#python에서는 input()을 문자열 단위로 받기 때문에, 문자열을 입력받고 끊어서 배열에 저장할 필요가 있습니다.
#array[i][j] = arr[i//max][j//max]로 저장하면 확대된 문자열을 array에 저장할  수 있습니다.
#한 줄을 출력할 때에는 end='' 으로 추가 개행이나 공백없이 출력해주어야 합니다.
#한 줄을 출력한 이후에 개행을 위해 print()를 시행합니다.
n,m=map(int,input().split())
#max=int(input())
arr=[[0]*m for i in range(n)]
#array=[[0]*m*max for i in range(n*max)]
for i in range(0,n):
    s=input()
    for j in range(0,m):
        arr[i][j]=s[j]
        
        
max=int(input())
array=[[0]*m*max for i in range(n*max)]

for i in range(0,n*max):
	for j in range(0,m*max):
		array[i][j]=arr[i//max][j//max]
		print(array[i][j], end='')
	print()
