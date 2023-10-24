from fractions import Fraction
import itertools


def cross(A, B):
    return {a + b for a in A for b in B}


def P(event, space):
    return Fraction(len(event & space), len(space))


urn = cross("W", "12345678") | cross("B", "123456") | cross("R", "123456789")


def combos(items, n):
    return {' '.join(combo) for combo in itertools.combinations(items, n)}


U6 = combos(urn, 6)

red6 = {i for i in U6 if i.count("R") == 6}
print(P(red6, U6))


b3w2r1 = {i for i in U6 if i.count("B") == 3 and i.count(
    "W") == 2 and i.count("R") == 1}

print(P(b3w2r1, U6))

w4 = {i for i in U6 if i.count("W") == 4}
print(P(w4, U6))
