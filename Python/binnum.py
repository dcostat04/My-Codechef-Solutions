def dec_to_binary(n):
    br= bin(n).replace("0b", "")
    x = br[::-1]
    while len(x)<8:
        x += '0'
    br = x[::-1]
    return br

if name == 'main':

    test_cases = int(input())

    for case in range(1,test_cases+1):
        n = int(input())
        if(n>=0 | n<=255):

             bin_num = dec_to_binary(n)
             print(bin_num)
