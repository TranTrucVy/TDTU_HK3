import matplotlib.pyplot as plt
import numpy as np
samples = [0.895, 0.91, 0.919, 0.926, 0.929, 0.931]
plt.plot(samples)
samples = [0.895, 0.91, 0.919, 0.926, 0.929, 0.931]
years = [2010, 2011, 2012, 2013, 2014, 2015]
plt.plot(years ,samples)
plt.xlabel('Years')
plt.ylabel('Yield')
plt.show()

years = range(2000, 2012)
apples = [0.895, 0.91, 0.919, 0.926, 0.929, 0.931, 0.934, 0.936, 0.937, 0.9375, 0.938, 0.933]
oranges = [0.962, 0.941, 0.930, 0.923, 0.918, 0.908, 0.907, 0.904, 0.901, 0.898, 0.896, .888]
plt.plot(years, apples)
plt.plot(years, oranges)
plt.xlabel('Year')
plt.ylabel('Yield')
plt.show()

years = range(2000, 2012)
apples = [0.895, 0.91, 0.919, 0.926, 0.929, 0.931, 0.934, 0.936, 0.937, 0.9375, 0.938, 0.933]
oranges = [0.962, 0.941, 0.930, 0.923, 0.918, 0.908, 0.907, 0.904, 0.901, 0.898, 0.896, .888]
plt.plot(years, apples)
plt.plot(years, oranges)
plt.xlabel('Year')
plt.ylabel('Yield')
plt.title('Crop Yields in Kanto')
plt.legend(['Apples', 'Oranges'])
plt.show()

years = range(2000, 2012)
apples = [0.895, 0.91, 0.919, 0.926, 0.929, 0.931, 0.934, 0.936, 0.937, 0.9375, 0.938, 0.933]
oranges = [0.962, 0.941, 0.930, 0.923, 0.918, 0.908, 0.907, 0.904, 0.901, 0.898, 0.896, .888]
plt.plot(years, apples, marker='x')
plt.plot(years, oranges, marker='o')
plt.xlabel('Year')
plt.ylabel('Yield')
plt.show()

years = range(2000, 2012)
apples = [0.895, 0.91, 0.919, 0.926, 0.929, 0.931, 0.934, 0.936, 0.937, 0.9375, 0.938, 0.933]
plt.figure(figsize=(10, 3))
plt.plot(years, apples, marker='x')
plt.show()

girls_grades = np.random.randint(100, size=30)
boys_grades = np.random.randint(100, size=30)
grades_range = np.random.randint(100, size=30)
fig = plt.figure(figsize=(3, 3))
ax = fig.add_axes([0, 0, 1, 1])
ax.scatter(grades_range, girls_grades, color='r')
ax.scatter(grades_range, boys_grades, color='b')
ax.set_xlabel('Grades Range')
ax.set_ylabel('Grades Score')
ax.set_title('scatter plot')
plt.show()

years = range(2000, 2006)
oranges = [0.4, 0.8, 0.9, 0.7, 0.6, 0.8]
plt.xlabel('Year')
plt.ylabel('Yield')
plt.bar(years, oranges)
plt.show()

years = range(2000, 2006)
oranges = [0.4, 0.8, 0.9, 0.7, 0.6, 0.8]
apples = [0.35, 0.6, 0.9, 0.8, 0.65, 0.8]
plt.xlabel('Year')
plt.ylabel('Yield')
plt.bar(years, apples)
plt.bar(years, oranges, bottom=apples)
plt.show()

data =[[30, 25, 50, 20], [40, 23, 51, 17]]
X = np.arange(4)
fig = plt.figure()
ax = fig.add_axes([0, 0, 1, 1])
ax.bar(X + 0.00, data[0], width=0.25, color='b')
ax.bar(X + 0.25, data[1], width=0.25, color='g')
ax.set_xticks([0.25, 1.25, 2.25, 3.25])
ax.set_xticklabels([2015, 2016, 2017, 2018])
ax.legend(['Apples', 'Oranges'])
plt.show()

fig, ax = plt.subplots(1, 1)
a = np.array([72, 87, 5, 73, 55, 54, 11, 20, 51, 5, 79, 31, 27])
ax.hist(a, bins=[0, 25, 50, 75, 100])
ax.set_title('histogram of result')
ax.set_xticks([0, 25, 50, 75, 100])
ax.set_xlabel('marks')
ax.set_ylabel('no. of students')
plt.show()