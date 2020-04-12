cases = int(input())

alphabet = list("abcdefghijklmnopqrstuvwxyz")


matrix = []

for i in range(cases):
    new = []
    string = input()
    new.append(string)
    for strings in new:
        yes = list(strings)
        inds = []
        for letter in yes:
            ind = alphabet.index(letter)
            inds.append(ind)
        matrix.append(inds)

matrix.sort()

final = []

for list in matrix:
    another = []
    for num in list:
        another.append(alphabet[num])
    for cock in another:
        cock = str(cock)
        another = ''.join(another)
    final.append(another)

for i in final:
    print(i)






