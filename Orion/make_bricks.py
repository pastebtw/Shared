small = int(input())
big = int(input())
goal = int(input())


def make_bricks(small, big, goal):
    goal1 = goal
    if (big * 5) >= goal1:
        if goal1 % 5 == 0:
            print('True')
        elif small >= goal1 % 5:
            print('True')
        else:
            print('False')
    elif small >= goal1:
        print('True')
    else:
        print('False')


make_bricks(small, big, goal);
