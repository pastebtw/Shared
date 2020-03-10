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
# index = 7, 7-1 = 6
