if name == 'main':
    test_case = int(input())
    for i in range(test_case):
        length = int(input())
        numbers = list(map(int, input().split(' ')))
        print(' '.join(map(str, numbers[::-1])))
        print(
            ' '.join(map(str, list(map(lambda x: x+3, numbers[3::3])))))
        print(
            ' '.join(map(str, list(map(lambda x: x-7, numbers[5::5])))))
        print(sum(numbers[3:8]))
