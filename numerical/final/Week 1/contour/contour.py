import numpy as np
import matplotlib.pyplot as plt

A = np.array([[2, 5], [5, 1]])
B = np.array([3, 2])

def f(x1, x2):
    X = np.array([x1, x2])
    return 0.5 * (A[0,0] * x1**2 + 2 * A[0,1] * x1 * x2 + A[1,1] * x2**2) - (B[0] * x1 + B[1] * x2)

x1_vals = np.linspace(-10, 10, 800)
x2_vals = np.linspace(-10, 10, 800)
X1, X2 = np.meshgrid(x1_vals, x2_vals)

Z = f(X1, X2)

plt.figure()
cp = plt.contour(X1, X2, Z, levels=50)
plt.clabel(cp, inline=True, fontsize=8)
plt.title('Contour plot of f(x1, x2)')
plt.xlabel('x1')
plt.ylabel('x2')
plt.show()
