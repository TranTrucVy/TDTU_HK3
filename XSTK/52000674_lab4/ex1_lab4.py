import random

def ex1_a(n):
    count = 0
    for i in range(n):
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        if (d1 == d2):
            count = count + 1
    return count/n

print(ex1_a(1000))
print(ex1_a(100000))

def ex1_b(n):
    count = 0
    for i in range(n):
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        if (d1 != d2):
            count = count + 1
    return count/n

print(ex1_b(1000))
print(ex1_b(100000))

def ex1_c(n):
    count = 0
    for i in range(n):
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        if (d1 % 2 == 0 and d2 % 2 == 0):
            count = count + 1
    return count/n

print(ex1_c(1000))
print(ex1_c(100000))

def ex1_d(n):
    count = 0
    for i in range(n):
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        if (d1 % 2 == 1 and d2 % 2 == 1):
            count = count + 1
    return count/n

print(ex1_d(1000))
print(ex1_d(100000))

def ex1_e(n):
    count = 0
    for i in range(n):
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        if (d1 + d2) % 2 == 1:
            count = count + 1
    return count/n

print(ex1_e(1000))
print(ex1_e(100000))

def ex1_f(n):
    count = 0
    for i in range(n):
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        if (d1 == d2 == 6):
            count = count + 1
    return count/n

print(ex1_f(1000))
print(ex1_f(100000))

def ex1_g(n):
    count = 0
    for i in range(n):
        d1 = random.randint(1, 6)
        d2 = random.randint(1, 6)
        if (d1 + d2 > 10):
            count = count + 1
    return count/n

print(ex1_g(1000))
print(ex1_g(100000))
