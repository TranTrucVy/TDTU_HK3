from fractions import Fraction
import itertools


def P(event, space):
    return Fraction(len(event & space), len(space))


S = {''.join(s) for s in itertools.product('MF', repeat=3)}
len_S = len(S)
B = {s for s in S if 'F' in s}
A = {s for s in S if s.count('F') == 3}
A_B = {s for s in B if s.count('F') == 3 and 'F' in s}

P_B = P(B, S)
P_A_B = P(A_B, S)
P_A_with_B = P_A_B / P_B
print(P_A_with_B)
