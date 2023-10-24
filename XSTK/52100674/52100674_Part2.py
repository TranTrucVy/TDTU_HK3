import cv2
import numpy as np
import matplotlib.pyplot as plt

# import ảnh gốc để cv2 đọc 
histogram_0 = "anhtest.jpg" # lấy ảnh từ cây thư mục 
img1 = cv2.imread(histogram_0) #ảnh này dùng để in ra so sánh
img = cv2.imread(histogram_0) #ảnh này dùng để gọi hàm cân bằng

#  tính kích thước của ảnh img1 ban đầu
hist1 = np.zeros((256,), np.uint8)
[width,height] = img1.shape[:2]

# duyệt phần tử để tính ra hình ảnh histogram của ảnh đầu
for i in range(width):
    for j in range(height):
        hist1[img1[i][j]] += 1
        
#  dùng hàm tính kích thước của ảnh 
def getSizeOfImage(img):
    hist = np.zeros((256,), np.uint8)
    [width,height] = img.shape[:2]

# duyệt phần tử để tính ra hình ảnh histogram
    for i in range(width):
        for j in range(height):
            hist[img[i][j]] += 1
    hist = hist.ravel()
    
# dùng mảng để lưu trữ histogram   
    array = np.zeros_like(hist, np.float64)
    
# hàm biến đổi theo bước 4 của lý thuyết (công thức)
    for i in range(len(array)):
        array[i] = hist[:i].sum()
    new_hist = ((array - array.min()) / (array.max() - array.min())) * 255
    new_hist = np.uint8(new_hist)
    return new_hist

# Cân bằng historgram/ gọi hàm tính kích thước về
histogram_1 = getSizeOfImage(img)

[width,height] = img.shape[:2]

#  tính các giá trị của histogram lúc sau
for i in range(width):
   for j in range(height):
        img[i,j] = histogram_1[img[i][j]]

# Dùng để xuất hiện ảnh để so sánh kết quả
fig = plt.figure()
plt.subplot(221)  #chia bố cực trên kết quả trả về
plt.title("Ảnh trước khi cân bằng")
plt.imshow(img1, cmap = 'gray')

plt.subplot(222)
plt.title("Ảnh sau khi cân bằng")
plt.imshow(img, cmap='gray')

plt.subplot(223)
plt.title("Histogram trước khi cân bằng")
plt.plot(hist1)

plt.subplot(224)
plt.plot(histogram_1)
plt.title("Histogram sau cân khi bằng")

plt.tight_layout() # để căn chỉnh layout cho kết quả trả về
plt.show()