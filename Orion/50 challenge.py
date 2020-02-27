challenge = True
n = []
total = []

def fifty_challenge(n):
    while challenge:
        n = int(input())
        if n > 50:
            total.append('1')
        elif n < 50:
            total.append('0')
        elif n == 50:
            for i in total:
                print (i)
            break
fifty_challenge(n)
