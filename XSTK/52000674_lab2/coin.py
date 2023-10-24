import random

n = 1000
count = 0
for simulations in range(n):
    tosses = random.randint(0, 1)
    if tosses == 1:
        count += 1

print(count/n)
