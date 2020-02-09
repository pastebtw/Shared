tasks = int(input())
lista = []
listb = []
listc = []

for i in range(tasks):
    priority, duration, name = input().split()
    name = list(name)
    name.remove('"')
    name.remove('"')
    name = ''.join(name)
    lista.append(int(priority))
    listb.append(int(duration))
    listc.append(name)

important = lista.index(max(lista))
final = listc[important]

hours = sum(listb) / 60
minutes = sum(listb) % 60
hours = int(hours)
minutes = int(minutes)
time = hours + minutes


print(final)
if time < 1000:
    print('0' + str(hours) + str(minutes))
else:
    print(hours + minutes)










