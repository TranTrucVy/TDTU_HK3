from fractions import Fraction


def P(event, space):
    return Fraction(len(event & space), len(space))


S = {'BB', 'BG', 'GB', 'GG'}
B = {s for s in S if 'B' in s}
A_B = {s for s in S if s.count('B') == 2}

P_B = P(B, S)
P_A_B = P(A_B, S)

P_A_with_B = P_A_B / P_B
print(P_A_with_B)
