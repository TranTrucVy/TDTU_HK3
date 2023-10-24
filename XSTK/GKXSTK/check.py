import statistics
# 7. Median_high
# Input: list số nguyên => output:số thực
Medianhigh1 = [1, 2 , 0, 9, 10, 8]
h_medianhigh1 = statistics.median_high(Medianhigh1)
print("Median high - gia tri trung vi cao la: ",h_medianhigh1)
#input: list số thực âm => output: số thực
Medianhigh2 = [-0.3, -0.7, -0.2, -0.8, -0.5, -0.4]
h_medianhigh2 = statistics.median_high(Medianhigh2)
print("Median high- gia tri trung vi cao la: ",h_medianhigh2)
#input: list rỗng
Medianhigh3 = []
h_medianhigh3 = statistics.median_high(Medianhigh3)
print("Median high - gia tri trung vi cao la: ",h_medianhigh3)
