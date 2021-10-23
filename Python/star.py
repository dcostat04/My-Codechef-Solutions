test_cases = int(input())
for case in range(1,test_cases+1):
    N= int(input())
    if(N>=0 | N<=100):
        for i in range(N+1,1,-1):
            for j in range(1,i):
                if(j%5==0):
                    print('#', end="")
                else:
                    print('*',end="")
            print('')
