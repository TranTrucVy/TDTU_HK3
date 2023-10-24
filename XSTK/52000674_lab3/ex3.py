from fractions import Fraction
import itertools
import random


def P(event, space):
    return Fraction(len(event), len(space))


cards = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K']
suits = ['♠', '♣', '♦', '♥']
S = {''.join(s) for s in itertools.product(cards, suits)}
comb = [' '.join(s) for s in list(itertools.combinations(S, 3))]
A1 = [s for s in comb if s.count('K') == 1 or s.count('K') == 2]
A2 = [s for s in comb if 'K' in s]
A1_A2 = [s for s in A1 if 'K' in s]


P_A1 = P(A1, comb)
P_A2 = P(A2, comb)
print(P_A1, P_A2)

C = random.sample(comb, len(comb))
A1 = [s for s in C if s.count('K') == 1 or s.count('K') == 2]
A2 = [s for s in C if 'K' in s]

P_A1 = P(A1, C)
P_A2 = P(A2, C)
print(P_A1, P_A2)
