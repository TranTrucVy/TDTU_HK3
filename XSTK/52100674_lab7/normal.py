import matplotlib.pyplot as plt
import math

def generator_data(a, b, size):
    n = (b - a) / (size - 1)
    result = []
    s = a
    while s < b:
        result.append(s)
        s += n
    if len(result) < size:
        result.append(b)
    return result


def pmf_normal(x, mu, sigma):
    return 1 / (math.sqrt(2 * math.pi * sigma ** 2)) * math.exp(-1 / 2 * (x - mu / sigma) ** 2)


def cdf_normal(x, mu, sigma):
    return 1 / 2 * (1 + math.erf((x - mu) / (sigma * math.sqrt(2))))


def plot_pmf_normal(mu, sigma):
    X = generator_data(mu - 4 * sigma, mu + 4 * sigma, 1000)
    P_normal = [pmf_normal(x, mu, sigma) for x in X]
    plt.plot(X, P_normal, '-')
    plt.title('PMF of Normal(%.2f, %.2f)' % (mu, sigma))
    plt.xlabel('X')
    plt.ylabel('P')
    plt.show()

def plot_cdf_normal(mu, sigma):
    X = generator_data(mu - 4 * sigma, mu + 4 * sigma, 1000)
    P_normal = [cdf_normal(x, mu, sigma) for x in X]
    plt.plot(X, P_normal, '-')
    plt.title('PMF of Normal(%.2f, %.2f)' % (mu, sigma))
    plt.xlabel('X')
    plt.ylabel('P')
    plt.show()

# plot_pmf_normal(0, 1.5)
plot_cdf_normal(0, 1.5)

print(cdf_normal(12, 10, 1) - cdf_normal(9, 10, 1))
