import matplotlib.pyplot as plt
import numpy as np

with open('data.txt', 'r') as f:
  text = f.read()

text = text.lower()
text = text.replace('.','')
text = text.replace(',','')

words = text.split()
words = list(set(words))
freq = [text.count(i) for i in words]
word, frequencies = zip(*sorted(zip(words, freq), key=lambda x: x[1], reverse=True))
frequencies = np.array(frequencies)
word = np.array(word)

fig = plt.figure(figsize=(7, 7))
plt.hist(frequencies, bins=30)
plt.title('Frequency of the most common words')
plt.xlabel('Words')
plt.ylabel('Frequency')
plt.xticks(rotation=90)
plt.show()
