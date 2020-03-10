cases = int(input())

new = []

for i in range(cases):
    index, word = input().split()
    index = int(index)
    wordz = list(word)
    wordz.pop(wordz.index(wordz[index - 1]))
    string = ''.join(wordz)
    new.append(string)

i = 1

for e in new:
    print(i, e)
    i += 1

# CONTEST
# 0123456
# index = 7, 7-1 = 6 nigga.

# given a number of test cases, remove the nth letter of an inputted string
# and return them in order by numbering them (1, 2, 3)

# sample input:
'''
4
4 MISSPELL
1 PROGRAMMING
7 CONTEST
3 BALLOON
'''
