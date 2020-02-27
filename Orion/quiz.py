score = 0
mistakes = 0


def quiz(question, answer):
    global score
    global mistakes
    quizes = True
    print(question)
    user_answer = input()
    while quizes:
        if user_answer == answer:
            print('Correct')
            score = score + 1
            quizes = False
        elif user_answer != answer:
            print('wtf u dumb')
            mistakes = mistakes + 1
            print("your score is " + score)
            quizes = False
        elif mistakes == 3:
            print("You failed, your score is " + score)

quiz('is lionel gay', 'yes')






