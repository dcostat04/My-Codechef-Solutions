def compute_distance(x1, y1, x2, y2):
    distance = 0
    distance=((x2-x1)2 + (y2-y1)2)**0.5
    return distance
if name == 'main':
    test_cases = int(input())
    for i in range(test_cases):
        x1, y1, x2, y2 = map(int, input().split(' '))
        p=compute_distance(x1, y1, x2, y2)
        a=format(p,'.2f')
        print("Distance:",a)
