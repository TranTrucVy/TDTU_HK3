import itertools
import random

Ranks = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K'}
Suits = {'♡', '♢', '♣', '♠'}
Cards = list(itertools.product(Ranks, Suits))


def simulator_poker1(n):
    count = 0
    chooseCards = list(itertools.combinations(Cards, 5))
    U5s = random.sample(chooseCards, n)
    for U5 in U5s:
        if U5[0][1] == U5[1][1] == U5[2][1] == U5[3][1] == U5[4][1] == '♡':
            count += 1
    return count/n


print(simulator_poker1(1000))
