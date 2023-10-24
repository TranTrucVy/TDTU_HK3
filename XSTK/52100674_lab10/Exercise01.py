from random import *

x = [randint(1,6)+randint(1,6) for _ in range(10000)]
X = list(set(x))
P = [x.count(i)/len(x) for i in X]
E = sum([i*j for i,j in zip(X,P)])
V = sum([i**2*j for i,j in zip(X,P)]) - E**2
S = V**0.5
print('X =',X)
print('P =',P)
print('E =',E)
print('V =',V)
print('S =',S)