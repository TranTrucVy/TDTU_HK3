import itertools

E = {"0", "1", "2", "3", "4", "5"}
a = [i + j + v for i in E for j in E for v in E if i != 0]
for i in a:
    print(i)
b = [''.join(s) for s in list(itertools.permutations(E, 4)) if s[0] != '0']
for i in b:
    print(i)
