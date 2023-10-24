import statistics
# 1. Mean - tính giá trị trung bình
# Mean1 input: list số nguyên => output: số nguyên
Mean1 = [1, 2 , 0, 9, 10, 8]
h_mean1 = statistics.mean(Mean1)
print("Mean - gia tri trung binh la: ",h_mean1)
# Mean2 input: list số thực => output: số thực
Mean2 = [0.3, 0.7, 0.2, 0.8, 0.5]
h_mean2 = statistics.mean(Mean2)
print("Mean - gia tri trung binh la: ",h_mean2)
# Mean3 input: list rỗng => output: StatisticsError
# Mean3 =[]
# h_mean3 = statistics.mean(Mean3)
# print("Mean - gia tri trung binh la: ",h_mean3)


# 2. Fmean - tính giá trị trung bình
# Fmean1 input: list số nguyên => output: số thực
Fmean1 = [1, 2 , 0, 9, 10, 8]
h_fmean1 = statistics.fmean(Fmean1)
print("Fmean - gia tri trung binh la: ",h_fmean1)
# FMean2 input: list số thực => output: số thực
Fmean2 = [0.3, 0.7, 0.2, 0.8, 0.5]
h_fmean2 = statistics.fmean(Fmean2)
print("Fmean - gia tri trung binh la: ",h_fmean2)
# FMean3 input: list rỗng => output: StatisticsError
# Fmean3 =[]
# h_fmean3 = statistics.fmean(Fmean3)
# print("Fmean - gia tri trung binh la: ",h_fmean3)


# 3. Geometric_mean
# input = [1, 3, 5, 7, 9] => output: 3.93628
Gmean1 = [1, 3, 5, 7, 9]
h_gmean1 = statistics.geometric_mean(Gmean1)
print("Geometric - Trung binh nhan: ", h_gmean1)
# input: số âm,0 bị lỗi
# Gmean2 = [0]
# h_gmean2 = statistics.geometric_mean(Gmean2)
# print("Geometric - Trung binh nhan: ", h_gmean2)


# 4. Harmonic_mean
# Input: list => output:
Hmean1 = [1, 2 , 3, 9, 10, 8]
h_hmean1 = statistics.harmonic_mean(Hmean1)
print("Harmonic - Gia tri trung binh dieu hoa: ", h_hmean1)
# Input: so am => output: StatisticsError
# Hmean2 =[-1]
# h_hmean2 = statistics.harmonic_mean(Hmean2)
# print("Harmonic - Gia tri trung binh dieu hoa: ", h_hmean2)

# input: Hmean1, weights
weights =[5, 30, 5, 7, 6, 8]
h_hmean3 = statistics.harmonic_mean(Hmean1, weights)
print("Harmonic - Gia tri trung binh dieu hoa: ", h_hmean3)


# 5. Median
# Input: list số nguyên => output:số thực
Median1 = [1, 2 , 0, 9, 10, 8]
h_median1 = statistics.median(Median1)
print("Median - gia tri trung vi la: ",h_median1)
#input: list số thực => output: số thực
Median2 = [0.3, 0.7, 0.2, 0.8, 0.5]
h_median2 = statistics.median(Median2)
print("Median - gia tri trung vi la: ",h_median2)
#input: list rỗng => lỗi
# Median3 = []
# h_median3 = statistics.median(Median3)
# print("Median - gia tri trung vi la: ",h_median3)

# 6. Median_low
# Input: list số nguyên => output:số nguyen
Medianlow1 = [1, 2 , 0, 9, 10, 8]
h_medianlow1 = statistics.median_low(Medianlow1)
print("Median low - gia tri trung vi thap la: ",h_medianlow1)
#input: list số thực âm => output: số thực
Medianlow2 = [-0.3, -0.7, -0.2, -0.8, -0.5, -0.4]
h_medianlow2 = statistics.median_low(Medianlow2)
print("Median low - gia tri trung vi la: ",h_medianlow2)
#input: list rỗng=> lỗi
# Medianlow3 = []
# h_medianlow3 = statistics.median_low(Medianlow3)
# print("Median low - gia tri trung vi thap la: ",h_medianlow3)


# 7. Median_high
# Input: list số nguyên => output:số thực
Medianhigh1 = [1, 2 , 0, 9, 10, 8]
h_medianhigh1 = statistics.median_high(Medianhigh1)
print("Median high - gia tri trung vi cao la: ",h_medianhigh1)
#input: list số thực âm => output: số thực
Medianhigh2 = [-0.3, -0.7, -0.2, -0.8, -0.5, -0.4]
h_medianhigh2 = statistics.median_high(Medianhigh2)
print("Median high- gia tri trung vi cao la: ",h_medianhigh2)
#input: list rỗng => lỗi
# Medianhigh3 = []
# h_medianhigh3 = statistics.median_high(Medianhigh3)
# print("Median high - gia tri trung vi cao la: ",h_medianhigh3)

# 8. Grouped Median
# Input: list số nguyên
Gmeadian1 = [1, 2 , 0, 9, 10, 8]
h_gmeadian1 = statistics.median_grouped(Gmeadian1)
print("Grouped Median cua Gmeadian1 la: ",h_gmeadian1)
#input: (data, interval)
Gmeadian2 = [1, 2 , 0, 9, 10, 8]
h_gmeadian2 = statistics.median_grouped(Gmeadian2,interval=3)
print("Grouped Median cua Gmeadian2 la: ",h_gmeadian2)
#input: list rỗng => lỗi
# Gmeadian3 = []
# h_gmeadian3 = statistics.median_grouped(Gmeadian3)
# print("Grouped Median cua Gmeadian1 la: ",h_gmeadian3)


# 9. Mode
# input: list số nguyên
mode1 = [1,5,6,7,6,2,1,2,3,2,5]
h_mode1= statistics.mode(mode1)
print("Mode cua mode1 la: ", h_mode1)
# input: tuple 
mode2 = ("XSTK","CSDL","XSTK","CTDL","CTDL","XSTK")
h_mode2 = statistics.mode(mode2)
print("Mode cua mode1 la: ", h_mode2)
# input: list rỗng => lối
# mode3 =[]
# h_mode3 = statistics.mode(mode3)
# print("Mode cua mode1 la: ", h_mode3)

# 10. Multimode
# input: tuple
multimode1 = ('tranthivensddhchobduocdegapvhaa')
h_multimode1= statistics.multimode(multimode1)
print("Mutimode cua multimode1 la: ", h_multimode1)
# input: list so nguyen
multimode2 = [1,2,3,3,2,1,3,4,6,7]
h_multimode2 = statistics.multimode(multimode2)
print("Mutimode cua multimode2 la: ", h_multimode2)
# input: list rỗng
multimode3 =[]
h_multimode3 = statistics.multimode(multimode3)
print("Mutimode cua multimode3 la: ", h_multimode3)


# 11. Quantiles
# Input: list số nguyên 
quantile1 = [1, 3, 5, 7, 9, 11, 10]
h_quantile1 = statistics.quantiles(quantile1, n = 4, method='exclusive')
print("Quantiles cua quantile1 la: ", h_quantile1)
# Input: không quá 2 phần tử => StatisticsError
# quantile2 = [1,2]
# h_quantile2 = statistics.quantiles(quantile2, n = 4, method='exclusive')
# print("Quantiles cua quantile2 la: ", h_quantile2)
# Input: n<=0 => StatisticsError
# quantile3 = [1, 3, 5, 7, 9, 11, 10]
# h_quantile3 = statistics.quantiles(quantile3, n = 0, method='exclusive')
# print("Quantiles cua quantile1 la: ", h_quantile3)


# 12. Pstdev
# Input: list
Pstdev1 = [1, 2, 5, 4, 8, 9 , 12]
mean1 = statistics.mean(Pstdev1)
h_ptsdev1 = statistics.pstdev(Pstdev1)
print("Pstdev1 - Do lech chuan la: ", h_ptsdev1)
# Input: có kèm tham số mean1
h_ptsdev2 = statistics.pstdev(Pstdev1, mean1)
print("Pstdev2 - Do lech chuan la: ", h_ptsdev2)
# Input: list rỗng => lỗi
# Pstdev3 = []
# h_ptsdev3 = statistics.pstdev(Pstdev3)
# print("Pstdev3 - Do lech chuan la: ", h_ptsdev3)



# 13. Pvariance
# Input: list
Pvariance1 = [1,3,5,7,8,9,9,0,5,6]
Pvariance3 = []
mu_pvariance = statistics.mean(Pvariance1)
h_pvariance1 = statistics.pvariance(Pvariance1)
print("Phuong sai cua Pvariance1 la: ", h_pvariance1)
# Input: có kèm tham số mu_pvariance
h_pvariance2 = statistics.pvariance(Pvariance1, mu_pvariance)
print("Phuong sai cua Pvariance1 co tham so la: ", h_pvariance2)
# # Input: list rỗng => lỗi
# h_pvariance3 = statistics.pvariance(Pvariance3)
# print("Phuong sai cua Pvariance3 la: ", h_pvariance3 )


# 14. Stdev
# Input: list
Stdev1= [1, 2, 5, 4, 8, 9 , 12]
mean_stdev1 = statistics.mean(Stdev1)
h_stdev1 = statistics.stdev(Stdev1)
print("Stdev1 - Do lech chuan la: ", h_stdev1)
# Input: có kèm tham số mean1
h_stdev2 = statistics.stdev(Stdev1, mean_stdev1)
print("Stdev2 - Do lech chuan la: ", h_stdev2)
# Input: list rỗng => lỗi
# Stdev3 = []
# h_stdev3 = statistics.stdev(Stdev3)
# print("Stdev3 - Do lech chuan la: ", h_stdev3)


# 15. Variance
# Input: list
Variance1 = [1,3,5,7,8,9,9,0,5,6]
Variance3 = [1]
xbar_var = statistics.mean(Variance1)
h_variance1 = statistics.variance(Variance1)
print("Phuong sai mau cua Variance1 la: ", h_variance1)
# Input: có kèm tham số mu_pvariance
h_variance2 = statistics.variance(Variance1, xbar_var)
print("Phuong sai mau cua Variance1 co tham so la: ", h_variance2)
# Input: list rỗng => lỗi
# h_variance3 = statistics.variance(Variance3)
# print("Phuong sai mau cua Variance3 la: ", h_variance3 )


# 16. Covariance
# input: list số nguyên
x_hps1 = [1,3,5,7,8,9,9]
y_hps1= [1,3,5,7,8,9,9]
hps1 = statistics.covariance(x_hps1, y_hps1)
print("Covariance - Hiep phuong sai 1 la: ", hps1)
# input: dưới 2 phần từ
# x_hps2 = [1]
# y_hps2 = [1]
# hps2 = statistics.covariance(x_hps2, y_hps2)
# print("Covariance - Hiep phuong sai 2 la: ", hps2)
# input: kích thước x và y khác nhau
# x_hps3 = [2,4,5,6,5]
# y_hps3 = [3,2,5,6]
# hps3 = statistics.covariance(x_hps3, y_hps3)
# print("Covariance - Hiep phuong sai 3 la: ", hps3)


# 17. Correlation
# input: list số nguyên
x_hstq1 = [1,3,5,7,8,9,9]
y_hstq1= [1,3,5,7,8,9,9]
hstq1 = statistics.correlation(x_hstq1, y_hstq1)
print("He so tuong quan cua Pearson 1 la: ", hstq1)
# input: dưới 2 phần từ
# x_hstq2 = [1]
# y_hstq2 = [1]
# hstq2 = statistics.correlation(x_hstq2, y_hstq2)
# print("He so tuong quan cua Pearson 2 la: ", hstq2)
# input: kích thước x và y khác nhau
# x_hstq3 = [2,4,5,6,5]
# y_hstq3 = [3,2,5,6]
# hstq3 = statistics.correlation(x_hstq3, y_hstq3)
# print("He so tuong quan cua Pearson 3 la: ", hstq3)


# 18. Linear_regression
date_day1 = [2,9,16,23,30]
video_total1 = [1, 2, 3, 4, 5]
slope, intercept = statistics.linear_regression(date_day1, video_total1)
linear1= slope * 2022 + intercept
print("Hoi quy tuyen tinh 1: ", linear1)
# input: dưới 2 phần từ
# date_day2 = [2]
# video_total2 = [1]
# slope, intercept = statistics.linear_regression(date_day2, video_total2)
# linear2= slope * 2022 + intercept
# print("Hoi quy tuyen tinh 2: ", linear2)
# input: kích thước x và y khác nhau
# date_day3 = [2,3,5,6,5]
# video_total3 = [1,1,4,5]
# slope, intercept = statistics.linear_regression(date_day3, video_total3)
# linear3= slope * 2022 + intercept
# print("Hoi quy tuyen tinh 3: ", linear3)
