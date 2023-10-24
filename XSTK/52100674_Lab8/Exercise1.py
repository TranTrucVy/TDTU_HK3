import pandas as pd
import math

df = pd.read_csv("iris.csv")

temp_dict = {}
for j in df:
	if df[j].dtype != object:
		count = 0
		mean = 0
		sum = 0
		std = 0
		min = df[j][0]
		max = df[j][0]
		for i in df[j]:
			sum += i
			count += 1
			if i < min:
				min = i
			if i > max:
				max = i
		mean = sum / count
		for i in df[j]:
			std += (i - mean) ** 2		
		std = math.sqrt(std / count)
		temp_dict[j] = [count, mean, std, min, max]

df = pd.DataFrame(temp_dict, index = ["count", "mean", "std", "min", "max"])
print(df)

