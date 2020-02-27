testcases = int(input())



def reverse_array(testcases):
    lst = []
    for i in range(testcases):
        b = int(input())
        lst.append(b)
    return lst[::-1]


print(reverse_array(testcases))