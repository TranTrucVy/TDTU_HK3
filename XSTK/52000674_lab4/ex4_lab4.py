import itertools
urn = {"w" + w for w in "12"} | {"b" +
                                 b for b in "123"} | {"r" + r for r in "1235"}

comb_3 = {' '.join(s) for s in list(itertools.combinations(urn, 3))}
white1blue1red1 = {s for s in comb_3 if s.count(
    "w") == 1 and s.count("b") == 1 and s.count("w") == 1}
print(len(white1blue1red1) / len(comb_3))
