import random


def simulator_dice1(n):
    count = 0
    for i in range(n):
        dice1 = random.randint(1, 6)
        dice2 = random.randint(1, 6)
        if (dice1 + dice2) % 2 == 0:
            count += 1
    return count/n


print(simulator_dice1(1000000))
