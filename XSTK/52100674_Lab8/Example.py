import pandas as pd
import numpy as np

df = pd.DataFrame({'numbers': [1,2,3], 'colors': ['red', 'white', 'blue']})
print(df)

df = pd.DataFrame({'numbers': [1,2,3], 'colors': ['red', 'white', 'blue']}, columns=['numbers', 'colors'])
print(df)

df = pd.DataFrame(np.random.randn(5,3), columns=['N1', 'N2', 'N3'])
print(df)

df = pd.DataFrame({'N1': [1,2,3,4], 'N2': [4,3,2,1]})
print(df)

L = [{'Name': 'John', 'Last Name': 'Smith'}, {'Name': 'Mary', 'Last Name': 'Wood'}]
df = pd.DataFrame(L)
print(df)

data = np.loadtxt("sample.txt", delimiter=',')
print(data)

data = pd.read_csv("sample.txt", delimiter=',')
print(data)

data = pd.read_csv('sample1.txt', delimiter=',')
print(data)
print("Print column Score")
print(data.Score)

df = pd.DataFrame(np.random.randn(10, 3), columns=['N1', 'N2', 'N3'])
print(df)
df.head(5)

df.tail(5)
N2 = df['N2']
print(N2)

df[['N1', 'N2']]

print(df[1:-2])