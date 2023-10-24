import itertools
import random

def cross(A, B):
    return {a + b for a in A for b in B}

def combo(items, n):
    return {' '.join(combo) for combo in itertools.combinations(items, n)}

Ranks = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '10', 'J', 'Q', 'K'}
Suits = {'♠', '♣', '♦', '♥'}
Cards = cross(Ranks, Suits)
ex3 = list(combo(Cards, 4))

def ex3_a(n):
    temp = random.sample(ex3, n)
    c = 0
    for i in temp:
        if i.count('♠') == 4 or i.count('♣') == 4 or i.count('♦') == 4 or i.count('♥') == 4:
            c = c + 1
    return c/n

print(ex3_a(1000))

def ex3_b(n):
    temp = random.sample(ex3, n)
    c = 0
    for i in temp:
        if i.count('♠') == 1 and i.count('♣') == 1 and i.count('♦') == 1 and i.count('♥') == 1:
            c = c + 1
    return c/n

print(ex3_b(1000))

def checkColor(c):
    if (c == '♠' or c == '♣'):
        return 0
    if (c == '♦' or c == '♥'):
        return 1

def ex3_c(n):
    temp = random.sample(ex3, n)
    c = 0
    S = []
    for i in temp:
        S.append(i.split(' '))
    for s in S:
        if checkColor(s[0][-1]) == checkColor(s[1][-1]) == checkColor(s[2][-1]) == checkColor(s[3][-1]) == 0 or checkColor(s[0][-1]) == checkColor(s[1][-1]) == checkColor(s[2][-1]) == checkColor(s[3][-1]) == 1:
            c = c + 1
    return c/n

print(ex3_c(1000))

def checkValue(L):
    S = []
    for l in L:
        if len(l) == 3:
            temp = str(l[0]) + str(l[1])
            S.append(temp)
        if len(l) == 2:
            S.append(l[0])
    if S[0] == S[1] == S[2] == S[3]:
        return True
    return False

def ex3_d(n):
    S = []
    c = 0
    temp = random.sample(ex3, n)
    for i in temp:
        S.append(i.split(' '))
    for s in S:
        if(checkValue(s) == True):
            print(s)
            c = c + 1
    return c/n

print(ex3_d(10000))

def ex3_e(n):
    temp = random.sample(ex3, n)
    c = 0
    for i in temp:
        if i.count('J') == i.count('Q') == i.count('K') == 0:
            c = c + 1
            # print(i)
    return c/n

print(ex3_e(1000))

def checkFace(s):
    if s.count('J') == 0 and s.count('Q') == 0 and s.count('K') == 0:
        return True
    if s.count('1') == s.count('2') == s.count('3') == s.count('4') == s.count('5') == s.count('6') == s.count('7') == s.count('8') == s.count('9') == s.count('0') == 0:
        return True
    return False

def ex3_f(n):
    temp = random.sample(ex3, n)
    c = 0
    for i in temp:
        if checkFace(i):
            c = c + 1
    return c/n

print(ex3_f(10000))
