T=int(input())
if T>=1 | T<=30:
    str=[]
    i=0
    for i in range(T):
        stri = input()
        str.append(stri)
    i=0
    for i in range(T):
        if len(str)>=2 | len(str)<= 1000:
            list=str[i]
            tre=list.lower()
            if (tre == tre[::-1]):
                print("It is a palindrome")
            else:
                print("It is not a palindrome")
