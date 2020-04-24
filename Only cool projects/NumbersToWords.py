# NOTE
# ONLY WORKS FOR NUMBERS UNDER 10,000,000,000

uniques = {
    "0": "",
    "1": 'one',
    "2": 'two',
    "3": 'three',
    "4": 'four',
    "5": 'five',
    "6": 'six',
    "7": 'seven',
    "8": 'eight',
    "9": "nine",
    "11": 'eleven',
    "12": 'twelve',
    "13": 'thirteen',
    "14": 'fourteen',
    "15": 'fifteen',
    "16": 'sixteen',
    "17": 'seventeen',
    "18": 'eighteen',
    "19": 'nineteen',

}

tens = {
    "0": "",
    "1": 'ten',
    "2": 'twenty',
    "3": 'thirty',
    "4": 'forty',
    "5": 'fifty',
    "6": 'sixty',
    "7": 'seventy',
    "8": 'eighty',
    "9": 'ninety'
}


num = input()
final = []
another = list(num)

# Sample: 101
# 13
# 8
# 5
# 4

name = ''


# while name != "four":
for e in range(1):
    eleven = False
    ind = 0
    for r in range(10 - (len(another))):
        another.insert(0, "bruh")
    for i in another:
        if eleven:
            eleven = False
            continue
        if i == "bruh":
            ind += 1
            continue
        else:
            if ind == 0:
                name += uniques.get(i, i) + "billion"
            if ind == 1:
                name += uniques.get(i, i) + "hundred"
            if ind == 2:
                if i == "1":  # if i is part of the other uniques e.g. eleven
                    wasd = "1"
                    wasd += another[ind+1]
                    name += uniques.get(wasd, i) + "million"
                    ind += 2
                    eleven = True
                    continue
                else:
                    name += tens.get(i, i)  # tens dictionary
            if ind == 3:
                name += uniques.get(i, i) + "million"
            if ind == 4:
                name += uniques.get(i, i) + "hundred"
            if ind == 5:
                if i == "1":  # if i is part of the other uniques e.g. eleven
                    wasd = "1"
                    wasd += another[ind + 1]
                    name += uniques.get(wasd, i) + "thousand"
                    ind += 2
                    eleven = True
                    continue
                else:
                    name += tens.get(i, i)  # tens dictionary
            if ind == 6:
                name += uniques.get(i, i) + "thousand"
            if ind == 7:
                name += uniques.get(i, i) + "hundred"
            if ind == 8:
                if i == "1":  # if i is part of the other uniques e.g. eleven
                    wasd = "1"
                    wasd += another[ind + 1]
                    name += uniques.get(wasd)
                    ind += 2
                    eleven = True
                    continue
                else:
                    name += tens.get(i, i)  # tens dictionary
            if ind == 9:
                name += uniques.get(i, i)
        ind += 1
    final.append(len(name))  # the number

# now i need to make something that converts len into words

# len(1947471476 (in words)) == 95
# 1,234,567,890
# 0,000,000,101
# 0,123,456,789
# ^ indexes
print(name)





