import matplotlib.pyplot as plt

file = open("text.txt", "r")
count_dict = {}
for i in file.read().lower():
	if i.isalpha():
		count_dict[i] = count_dict.get(i, 0) + 1

keys = list(count_dict.keys())
values = list(count_dict.values())
plt.bar(keys, values)
plt.show()
