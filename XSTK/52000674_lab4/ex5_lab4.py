import itertools
import random

ranks = ["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"]
suits = ["C", "D", "H", "S"]
cards = [''.join(s) for s in list(itertools.product(ranks, suits))]

comb_5 = [' '.join(s) for s in list(itertools.combinations(cards, 5))]
count = 0
for i in comb_5:
    for j in range(len(ranks) - 4):
        if i.count(ranks[j]) == 1 and i.count(ranks[j + 1]) == 1 and i.count(ranks[j + 2]) == 1 and i.count(ranks[j + 3]) == 1 and i.count(ranks[j + 4]) == 1:
            count += 1

print(count / len(comb_5))

sample = random.sample(comb_5, 10000)

count = 0
for i in sample:
    for j in range(len(ranks) - 4):
        if i.count(ranks[j]) == 1 and i.count(ranks[j + 1]) == 1 and i.count(ranks[j + 2]) == 1 and i.count(ranks[j + 3]) == 1 and i.count(ranks[j + 4]) == 1:
            count += 1

print(count / len(comb_5))
