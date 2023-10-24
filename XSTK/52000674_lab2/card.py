import itertools
import random

Ranks = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K'}
Suits = {'♡', '♢', '♣', '♠'}
Cards = list(itertools.product(Ranks, Suits))


def simulator_poker(n):
    count = 0
    for i in range(n):
        index = random.randint(0, 51)
        if Cards[index][1] == '♡' or Cards[index][1] == '♢':
            count += 1
        return count/n


print(simulator_poker(10))
print(simulator_poker(100))
print(simulator_poker(1000))
print(simulator_poker(10000))
