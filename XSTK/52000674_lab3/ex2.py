from fractions import Fraction
import itertools


def P(event, space):
    return Fraction(len(event), len(space))


S = [('Thanh', 'Nữ'), ('Hồng', 'Nữ'), ('Thương', 'Nữ'), ('Đào', 'Nữ'), ('My', 'Nữ'), ('Yến', 'Nữ'), ('Hạnh', 'Nữ'),
     ('My', 'Nữ'), ('Vy', 'Nữ'), ('Tiên', 'Nữ'), ('Thanh', 'Nam'), ('Thanh', 'Nam'), ('Bình', 'Nam'), ('Nhật', 'Nam'), ('Hào', 'Nam'), ('Đạt', 'Nam'), ('Minh', 'Nam')]
A = [s for s in S if s[0] == 'Thanh']
B = [s for s in S if s[1] == 'Nữ']
A_B = [s for s in S if s[0] == 'Thanh' and s[1] == 'Nữ']

P_A = P(A, S)
P_B = P(B, S)
P_A_B = P(A_B, S)
P_A_with_B = P_A_B / P_B
print(P_A_with_B)
