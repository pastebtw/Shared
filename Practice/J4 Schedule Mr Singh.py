import math

tasks = int(input())
lista = []
listb = []
listc = []

for i in range(tasks):
    priority, duration, name = input().split()
    name = list(name)
    name.remove(name[0])
    name.remove(name[-1])
    name = ''.join(name)
    lista.append(int(priority))
    listb.append(int(duration))
    listc.append(name)

important = lista.index(max(lista))
final = listc[important]

summ = sum(listb) * 3
minutes = summ % 60 # filters out minutes
hours = summ / 60 % 24 + (math.floor(summ / 60)) #3045 / 60 = hours, divide out the extra hours > 24
days = summ / 60 / 24 + (math.floor(summ / 24))  #remainder of hours


print(final)
if time < 1000:
    print('0' + str(hours) + str(minutes))
else:
    print(hours + minutes)










