

#burger
#012345


string = input()
substring = input()
sub = list(substring)
new = []
mhm = False

for i in range(len(substring)):
    key = 1
    x = sub[(sub.index(sub[i]) + key) % len(sub)]
    new.append(x)
    for e in range(len(string) - len(substring) + 1):
        if string[e:e+len(substring)] == substring:
            mhm = True
            break
        else:
            continue


print(mhm)
print(substring)       # this and the print statements under were used for testing purposes
print(new)
print(len(substring))





