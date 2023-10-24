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

w2b2r2 = {i for i in U6 if i.count("R") == 2 and i.count(
    "W") == 2 and i.count("B") == 2}
print(P(w2b2r2, U6))
