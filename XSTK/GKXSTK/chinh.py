import cv2
import numpy as np
import matplotlib.pyplot as plt

histogram_0 = "anhtest.jpg"
img1 = cv2.imread(histogram_0)
# img = cv2.imread(histogram_0)

hist1 = np.zeros((256,), np.uint8)
[width,height] = img1.shape[:2]

for i in range(width):
    for j in range(height):
        hist1[img1[i][j]] += 1
        
fig = plt.figure()
plt.subplot(121)
plt.imshow(img1, cmap = 'gray')
plt.subplot(122)
plt.plot(hist1)
plt.show()
