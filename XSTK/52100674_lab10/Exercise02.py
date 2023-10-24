from math import *

import matplotlib.pyplot as plt
def pmf_normal(x,mu,sigma):
  return 1/(sigma*sqrt(2*pi))*exp(-(x-mu)**2/(2*sigma**2))

def cdf_normal(x,mu,sigma):
  return 0.5*(1+erf((x-mu)/(sigma*sqrt(2))))

x = [i/100 for i in range(-1000,1000)]
y = [pmf_normal(i,3,4) for i in x]
plt.plot(x,y)
plt.show()

x = [i/100 for i in range(-1000,1000)]
y = [cdf_normal(i,3,4) for i in x]
plt.plot(x,y)
plt.show()

print(cdf_normal(7,3,4)-cdf_normal(2,3,4))