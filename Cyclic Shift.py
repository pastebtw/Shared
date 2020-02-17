

string = input()
substring = input()
new = []

for i in range(len(substring)):
    key = 1
    x = substring[(substring.index(substring[i]) + key) % len(substring)]   #sample input : abcde, a takes the place of the
    new.append(x)                                                           #item in the next index, since key is 1
                                                                            #divides by len(substring) to have last value to be first index
for i in new:
    print(i)



