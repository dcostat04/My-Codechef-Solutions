if name == 'main':

    # Take the T (test_cases) input
    test_cases = int(input())
    for k in range(test_cases):
        n=int(input())
        i=0
        arr=[]
        for j in range (n):

            if(i==0):
                a=i+3
                i=i+1 
                arr.append(a)
            elif(i%2==1):
                a=ii 
                i=i+1 
                arr.append(a)
            else:
                a=2i 
                i=i+1 
                arr.append(a)
        for m in range(n):
            print(arr[m], end =" ")
