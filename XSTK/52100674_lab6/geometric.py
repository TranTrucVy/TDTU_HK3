import math
import matplotlib.pyplot as plt

def pmf_geo(p, x):
    return p * (1-p)**(x-1)

def plot_pmf_geo(p, n):
    X = list(range(0, n + 1))
    P_geo = [pmf_geo(p, x) for x in X]
    plt.plot(X, P_geo, '-o')
    plt.title('PMF of Geometric(p=%.2f)' % p)
    plt.xlabel('n')
    plt.ylabel('Probability')
    plt.show()

plot_pmf_geo(0.3, 10)
