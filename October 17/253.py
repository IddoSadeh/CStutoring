from sympy import *
# you might not need this on Syzygy / Jupyter
init_printing()

x = Symbol('x', real=True)
y = Symbol('y', real=True)

f = (-x**2 + 4*x)*(-y**2 + 4*y)

f_x = f.diff(x)
# we can also do "Object-Oriented-style":
f_y = f.diff(y)

# print to screen
print(str(f_x))
print(str(f_y))