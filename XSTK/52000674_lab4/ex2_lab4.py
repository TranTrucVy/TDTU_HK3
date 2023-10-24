import itertools
import random

def cross(A, B):
    return {a + b for a in A for b in B}

def combo(items, n):
    return {' '.join(combo) for combo in itertools.combinations(items, n)}

urn = cross('B', '12') | cross('R', '123') | cross('W', '12345')
urn_ex2 = combo(urn, 3)
print(len(urn_ex2))

def ex2_a(n):
    c = 0
    temp = random.sample(urn_ex2, n)
    for i in range(n):
        if temp[i].count('W') == 3 or temp[i].count('R') == 3:
            print(temp[i])
            c = c + 1
    return c/n

print(ex2_a(80))

def ex2_b(n):
    c = 0
    temp = random.sample(urn_ex2, n)
    for i in range(n):
        if temp[i].count('B') == temp[i].count('W') == temp[i].count('R') == 1:
            c = c + 1
            print(temp[i])
    return c/n

print(ex2_b(100))

def ex2_c(n):
    c = 0
    temp = random.sample(urn_ex2, n)
    for i in range(n):
        if temp[i].count('B') == 2 or temp[i].count('W') == 2 or temp[i].count('R') == 2:
            c = c + 1
            print(temp[i])
    return c/n

print(ex2_c(100))

def ex2_d(n):
    c = 0
    temp = random.sample(urn_ex2, n)
    for i in range(n):
        if temp[i].count('R') == 2 and temp[i].count('W') == 1:
            c = c + 1
            print(temp[i])
    return c/n

print(ex2_d(100))
temp = random.sample(urn_ex2, 100)
for i in range(100):
    if temp[i].count('W') == 3:
        print(temp[i])
