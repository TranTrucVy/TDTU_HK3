import pandas as pd
import numpy as np
import matplotlib.pyplot as plt
df = pd.read_csv('./company-sales_data.csv')
df.head()

plt.plot(df['month_number'], df['total_profit'])
plt.show()

plt.scatter( df['month_number'],df['toothpaste'])
plt.show()

data =[df['facecream'], df['facewash']]
X = np.arange(len(df['month_number']))
fig = plt.figure()
ax = fig.add_axes([0, 0, 1, 1])
ax.bar(X + 0.00, data[0], width=0.25, color='b')
ax.bar(X + 0.25, data[1], width=0.25, color='g')
ax.set_xticks(range(len(df['month_number'])))
ax.set_xticklabels(df['month_number'])
ax.legend(['Face cream', 'Face wash'])
plt.show()