import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

df = pd.read_csv('./iris.csv')

fig = plt.figure(figsize=(3, 3))
ax = fig.add_axes([0, 0, 1, 1])
ax.scatter(df['sepal_length'], df['sepal_width'], color = 'r')
ax.set_xlabel('sepal_length')
ax.set_ylabel('sepal_width')
ax.set_title('scatter plot')
plt.show()

fig, ax = plt.subplots(1, 1)
a = df['sepal_length']
ax.hist(a, bins=[0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20])
ax.set_xticks([0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20])
ax.set_ylabel('')
plt.show()