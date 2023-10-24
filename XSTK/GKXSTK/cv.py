import cv2
import numpy as np
import matplotlib.pyplot as plt

histogram_0 = "anhtest.jpg"
img1 = cv2.imread(histogram_0)
img = cv2.imread(histogram_0)

hist1 = np.zeros((256,), np.uint8)
[width,height] = img1.shape[:2]

for i in range(width):
    for j in range(height):
        hist1[img1[i][j]] += 1
# lấy kích thước của ảnh 
def getSizeOfImage(img):
    hist = np.zeros((256,), np.uint8)
    [width,height] = img.shape[:2]

# tính các giá trị của histogram
    for i in range(width):
        for j in range(height):
            hist[img[i][j]] += 1
    hist = hist.ravel()
    
    array = np.zeros_like(hist, np.float64)
# hàm biến đổi theo bước 4 của lý thuyết
    for i in range(len(array)):
        array[i] = hist[:i].sum()
    new_hist = ((array - array.min()) / (array.max() - array.min())) * 255
    new_hist = np.uint8(new_hist)
    return new_hist

# Cân bằng historgram
histogram_1 = getSizeOfImage(img)

[width,height] = img.shape[:2]
# # tính các giá trị của histogram 1
for i in range(width):
   for j in range(height):
        img[i,j] = histogram_1[img[i][j]]

# Hiện ảnh
fig = plt.figure()
plt.title("Trước và sau khi dùng histogram equalization")
plt.subplot(221)
plt.title("Ảnh trước cân bằng")
plt.imshow(img1, cmap = 'gray')

plt.subplot(222)
plt.title("Ảnh sau cân bằng")
plt.imshow(img, cmap='gray')

plt.subplot(223)
plt.title("Histogram trước cân bằng")
plt.plot(hist1)

plt.subplot(224)
plt.plot(histogram_1)
plt.title("Histogram sau cân bằng")

plt.tight_layout()
plt.show()


       
    





    